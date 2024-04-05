package com.together.togetherpj.domain.id;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReviewId is a Querydsl query type for ReviewId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QReviewId extends BeanPath<ReviewId> {

    private static final long serialVersionUID = 871435983L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReviewId reviewId = new QReviewId("reviewId");

    public final QApplyingId applyingId;

    public final NumberPath<Long> reviewerId = createNumber("reviewerId", Long.class);

    public QReviewId(String variable) {
        this(ReviewId.class, forVariable(variable), INITS);
    }

    public QReviewId(Path<? extends ReviewId> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReviewId(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReviewId(PathMetadata metadata, PathInits inits) {
        this(ReviewId.class, metadata, inits);
    }

    public QReviewId(Class<? extends ReviewId> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.applyingId = inits.isInitialized("applyingId") ? new QApplyingId(forProperty("applyingId")) : null;
    }

}

