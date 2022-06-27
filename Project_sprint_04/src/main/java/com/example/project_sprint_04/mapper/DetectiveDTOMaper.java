package com.example.project_sprint_04.mapper;

import com.example.project_sprint_04.entity.CriminalCase;
import com.example.project_sprint_04.entity.Detective;
@org.mapstruct.Mapper(componentModel = "spring")
public interface DetectiveDTOMaper extends Mapper<Detective,DetectiveDTOMaper> {
}
