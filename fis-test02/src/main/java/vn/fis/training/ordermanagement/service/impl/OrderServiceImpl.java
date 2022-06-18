package vn.fis.training.ordermanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.fis.training.ordermanagement.domain.Customer;
import vn.fis.training.ordermanagement.domain.Order;
import vn.fis.training.ordermanagement.domain.OrderItem;
import vn.fis.training.ordermanagement.domain.OrderStatus;
import vn.fis.training.ordermanagement.repository.OrderRepository;
import vn.fis.training.ordermanagement.service.OrderService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;


@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order addOrderItem(Long orderId,OrderItem orderItem) {
        Order order = findOrdersById(orderId);
        order.getOrderItems().add(orderItem);
        order.setTotalAmount(order.getOrderItems()
                .stream()
                .mapToDouble(
                        o-> o.getAmount())
                .sum());
        return orderRepository.save(order);
    }

    @Override
    public Order removeOrderItem(Long orderId,OrderItem orderItem) {
        Order order = findOrdersById(orderId);
        order.getOrderItems().remove(orderItem);
        order.setTotalAmount(order.getOrderItems()
                .stream()
                .mapToDouble(
                        o-> o.getAmount())
                .sum());
        return order;
    }

    @Override
    public Order updateOrderStatus(Order order, OrderStatus orderStatus) {
        Order order1 = findOrdersById(order.getId());
        order1.setStatus(orderStatus);
        return orderRepository.save(order1);
    }

    @Override
    public Order findOrdersById(Long id) {
        Optional<Order> order = orderRepository.findById(id);
        return order.get();
    }

    @Override
    public List<Order> findOrdersBetween(LocalDateTime fromDateTime, LocalDateTime toDateTime) {

        return orderRepository.findByOrderDateTimeBetween(fromDateTime,toDateTime);
    }

    @Override
    public List<Order> findWaitingApprovalOrders() {
        List<Order> orderList = orderRepository.findOrdersByStatus(OrderStatus.WAITING_APPROVAL);
        return orderList;
    }

    @Override
    public List<Order> findOrdersByOrderStatus(OrderStatus orderStatus) {
        List<Order> orderList = orderRepository.findOrdersByStatus(orderStatus);
        return orderList;
    }

    @Override
    public List<Order> findOrdersByCustomer(Customer customer) {
        List<Order> orderList= orderRepository.findOrdersByCustomer(customer);
        return orderList;
    }
}
