package com.together.togetherpj.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QApplying is a Querydsl query type for Applying
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QApplying extends EntityPathBase<Applying> {

    private static final long serialVersionUID = -2115807797L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QApplying applying = new QApplying("applying");

    public final QMember applier;

    public final com.together.togetherpj.domain.id.QApplyingId id;

    public final BooleanPath isOk = createBoolean("isOk");

    public final QRecruit recruit;

    public final ListPath<Review, QReview> reviewList = this.<Review, QReview>createList("reviewList", Review.class, QReview.class, PathInits.DIRECT2);

    public QApplying(String variable) {
        this(Applying.class, forVariable(variable), INITS);
    }

    public QApplying(Path<? extends Applying> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QApplying(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QApplying(PathMetadata metadata, PathInits inits) {
        this(Applying.class, metadata, inits);
    }

    public QApplying(Class<? extends Applying> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.applier = inits.isInitialized("applier") ? new QMember(forProperty("applier")) : null;
        this.id = inits.isInitialized("id") ? new com.together.togetherpj.domain.id.QApplyingId(forProperty("id")) : null;
        this.recruit = inits.isInitialized("recruit") ? new QRecruit(forProperty("recruit"), inits.get("recruit")) : null;
    }

}

