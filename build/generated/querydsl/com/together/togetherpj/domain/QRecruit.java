package com.together.togetherpj.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRecruit is a Querydsl query type for Recruit
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRecruit extends EntityPathBase<Recruit> {

    private static final long serialVersionUID = 1530562631L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRecruit recruit = new QRecruit("recruit");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final ListPath<Applying, QApplying> applyingList = this.<Applying, QApplying>createList("applyingList", Applying.class, QApplying.class, PathInits.DIRECT2);

    public final StringPath city = createString("city");

    public final StringPath content = createString("content");

    public final NumberPath<Long> curNum = createNumber("curNum", Long.class);

    public final DatePath<java.time.LocalDate> enddate = createDate("enddate", java.time.LocalDate.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath imgName = createString("imgName");

    public final StringPath imgPath = createString("imgPath");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modDate = _super.modDate;

    public final NumberPath<Long> perNum = createNumber("perNum", Long.class);

    public final QMember recruitWriter;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regDate = _super.regDate;

    public final StringPath spot = createString("spot");

    public final DatePath<java.time.LocalDate> startdate = createDate("startdate", java.time.LocalDate.class);

    public final EnumPath<com.together.togetherpj.constant.State> state = createEnum("state", com.together.togetherpj.constant.State.class);

    public final StringPath title = createString("title");

    public final NumberPath<Long> viewcount = createNumber("viewcount", Long.class);

    public QRecruit(String variable) {
        this(Recruit.class, forVariable(variable), INITS);
    }

    public QRecruit(Path<? extends Recruit> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRecruit(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRecruit(PathMetadata metadata, PathInits inits) {
        this(Recruit.class, metadata, inits);
    }

    public QRecruit(Class<? extends Recruit> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.recruitWriter = inits.isInitialized("recruitWriter") ? new QMember(forProperty("recruitWriter")) : null;
    }

}

