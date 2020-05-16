# seckill
针对不同技术选型的秒杀项目

## 整体大致流程
未开始>显示秒杀商品>活动开始>点击秒杀>有库存>生成订单>锁库存>减库存

## 技术选型
### 单机
基于数据库的锁防止超卖
- 悲观锁
- 乐观锁

基于redis的分布式锁以及缓存

基于redis的分布式锁优化(库存锁分段，提高并发率)

基于redis的分布式锁优化(库存锁分段，提高并发率)、redis提前预热缓存 + 消息队列(RabbitMQ、disruptor、kafka)

增加限流, 前端限流(点击过于频繁置灰或者弹出验证码)、后端限流(redis接入层的限流、controller的限流)

### 集群

### 微服务
分库分表

分布式事务
 
## 后续优化
1.jvm的参数调优
2.Tomcat参数调优

## 压测
1.表制造大量历史数据

2.模拟高并发

## 压测报告