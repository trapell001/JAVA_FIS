package vn.fis.training.ordermanagement.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import vn.fis.training.ordermanagement.domain.Order;
import vn.fis.training.ordermanagement.domain.OrderItem;
import vn.fis.training.ordermanagement.domain.OrderStatus;
import vn.fis.training.ordermanagement.domain.Product;
import vn.fis.training.ordermanagement.repository.OrderRepository;
import vn.fis.training.ordermanagement.service.OrderService;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class OrderServiceImplTest {
    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderRepository orderRepository;
    @Test
    void createOrder() {
        Order order = new Order();
        orderService.createOrder(order);
    }

    @Test
    void addOrderItem() {
        Order order = orderService.findOrdersById(1l);
        OrderItem orderItem = order.getOrderItems().get(1);
    }

    @Test
    void removeOrderItem() {
        Order order = orderService.findOrdersById(1l);
        OrderItem orderItem = new OrderItem();
        orderItem.setId(1l);
        order.getOrderItems().remove(orderItem);
    }

    @Test
    void updateOrderStatus() {
        Order order = orderService.findOrdersById(1l);
        orderService.updateOrderStatus(order, OrderStatus.WAITING_APPROVAL);
    }

    @Test
    void findOrdersById() {
    }

    @Test
    void findOrdersBetween() {
    }

    @Test
    void findWaitingApprovalOrders() {
    }

    @Test
    void findOrdersByOrderStatus() {
    }

    @Test
    void findOrdersByCustomer() {
    }
}