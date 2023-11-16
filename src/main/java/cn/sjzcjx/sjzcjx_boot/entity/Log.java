package cn.sjzcjx.sjzcjx_boot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author hasd
 * @since 2023-11-16
 */
@Getter
@Setter
@ApiModel(value = "Log对象", description = "")
@AllArgsConstructor
public class Log implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    @ApiModelProperty("类型1访问2下载")
    private Integer type;

    private Integer resourceId;

    private String user;

    private String userIp;

    private LocalDateTime createdAt;


}