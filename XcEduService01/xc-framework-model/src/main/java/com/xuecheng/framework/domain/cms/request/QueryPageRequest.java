package com.xuecheng.framework.domain.cms.request;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class QueryPageRequest {

    //站点ID
    @ApiModelProperty("站点ID")
    private String siteId;
    //页面ID
    @Id
    @ApiModelProperty("页面ID")
    private String pageId;
    //页面名称
    @ApiModelProperty("页面名称")
    private String pageName;
    //别名
    @ApiModelProperty("页面别名")
    private String pageAliase;
    //模版id
    @ApiModelProperty("模版id")
    private String templateId;
}
