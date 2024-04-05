package com.together.togetherpj.domain.id;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QApplyingId is a Querydsl query type for ApplyingId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QApplyingId extends BeanPath<ApplyingId> {

    private static final long serialVersionUID = 1926301483L;

    public static final QApplyingId applyingId = new QApplyingId("applyingId");

    public final NumberPath<Long> applierId = createNumber("applierId", Long.class);

    public final NumberPath<Long> recruitId = createNumber("recruitId", Long.class);

    public QApplyingId(String variable) {
        super(ApplyingId.class, forVariable(variable));
    }

    public QApplyingId(Path<? extends ApplyingId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QApplyingId(PathMetadata metadata) {
        super(ApplyingId.class, metadata);
    }

}

