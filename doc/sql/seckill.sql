create table t_goods
(
    id         int auto_increment
        primary key,
    goods_code varchar(32)  default '' not null,
    goods_name varchar(128) default '' null comment '商品名称',
    stock      int          default 0  not null comment '商品库存'
)
    comment '商品表' charset = latin1;

create table t_order
(
    id           int auto_increment
        primary key,
    user_id      int                                   not null,
    order_no     varchar(64) default ''                null comment '订单编号',
    gmt_create   timestamp   default CURRENT_TIMESTAMP null,
    gmt_modified timestamp   default CURRENT_TIMESTAMP null
)
    comment '订单表';