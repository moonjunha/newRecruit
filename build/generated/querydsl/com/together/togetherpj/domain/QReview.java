package com.together.togetherpj.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReview is a Querydsl query type for Review
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReview extends EntityPathBase<Review> {

    private static final long serialVersionUID = 742666543L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReview review = new QReview("review");

    public final QApplying applying;

    public final StringPath comment = createString("comment");

    public final QMember reviewer;

    public final com.together.togetherpj.domain.id.QReviewId reviewId;

    public QReview(String variable) {
        this(Review.class, forVariable(variable), INITS);
    }

    public QReview(Path<? extends Review> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReview(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReview(PathMetadata metadata, PathInits inits) {
        this(Review.class, metadata, inits);
    }

    public QReview(Class<? extends Review> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.applying = inits.isInitialized("applying") ? new QApplying(forProperty("applying"), inits.get("applying")) : null;
        this.reviewer = inits.isInitialized("reviewer") ? new QMember(forProperty("reviewer")) : null;
        this.reviewId = inits.isInitialized("reviewId") ? new com.together.togetherpj.domain.id.QReviewId(forProperty("reviewId"), inits.get("reviewId")) : null;
    }

}

