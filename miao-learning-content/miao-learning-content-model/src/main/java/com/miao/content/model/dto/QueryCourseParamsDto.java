package com.miao.content.model.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @author miao
 * @version 1.0
 * @title QueryCourseParamsDto
 * @description TODO
 * @date 2023/1/18 16:59
 */
@Data
@ToString
public class QueryCourseParamsDto {
    private String auditStatus;
    private String courseName;
    private String publishStatus;
}
