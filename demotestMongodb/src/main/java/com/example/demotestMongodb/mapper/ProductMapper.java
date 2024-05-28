package com.example.demotestMongodb.mapper;

import com.example.demotestMongodb.entity.ProductEntity;
import com.example.demotestMongodb.model.ProductRQ;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductMapper {
    ProductEntity from(ProductRQ productRQ);

    ProductRQ to(ProductEntity productEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateProductFromRQ(ProductRQ productRQ, @MappingTarget ProductEntity productEntity);
}
