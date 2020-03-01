/**
 * @program school-bus
 * @description: PageBusCountResponse
 * @author: mf
 * @create: 2020/03/01 16:54
 */

package com.stylefeng.guns.rest.bus.dto;

import com.stylefeng.guns.rest.common.AbstractResponse;
import lombok.Data;

import java.util.List;

@Data
public class PageBusResponse extends AbstractResponse {

    // 当前页
    private Long currentPage;
    // 每页数量
    private Long pageSize;
    // 总量
    private Long total;
    // 总页
    private Long pages;
    // BusDto
    private List<BusDto> busDtos;

}