package com.kevin.quartz;

/**
 * @author kevin
 * @version 1.0
 * @description     Cron表达式讲解
 * @createDate 2019/3/20
 */
public class Cron {

    /**
     * Cron表达式讲解：
     *     Cron表达式是一个字符串，分为6或7个域，每一个域代表一个含义
     *     Cron有如下两个语法格式：
     *          1.Seconds Minutes Hours Day Month Week Year
     *          2.Seconds Minutes Hours Day Month Week
     *     结构：
     *          Cron从左到右（用空格隔开）：秒 分 小时 月份中的日期 月份 星期中的日期 年份
     *     各字段含义：
     *         位置  时间域名    允许值     允许的特殊字符
     *          1       秒        0-59           , - * /
     *          2      分钟       0-59           , - * /
     *          3      小时       0-23           , - * /
     *          4       日        1-31           , - * ? / L W C
     *          5       月        1-12           , - * /
     *          6    星期日期     1-7            , - * ? / L C #
     *          7       年      1970-2099        , - * /
     *
     *          * ：可以使用在所有字段中，表示对应时间的每一个时刻。比如：分钟字段中，表示每分钟。
     *          ? ：表示舍弃。比如：星期字段中使用?，则表示不使用星期。
     *          - ：表示一个范围。比如：在小时字段中使用"10-12"，则表示10点到12点，即10,11,12。
     *          , ：表示一个列表值。比如：在星期字段中使用"MON,WED,FRI"，则表示星期一，星期三和星期五。
     *          / ： x/y 表达一个等步长序列， x 为起始值， y 为增量步长值。 如在分钟字段中使用 0/15，
     *              则表示为 0,15,30 和 45 秒， 而 5/15 在分钟字段中表示 5,20,35,50， 你也可以使用* / y，它等同于 0/y。
     *          L ：该字符只在日期和星期字段中使用，代表“Last”的意思，但它在两个字段中意思不同。L 在日期字段中，
     *              表示这个月份的最后一天，如一月的 31号，非闰年二月的 28号。如果 L用在星期中，则表示星 期六，等同于 7。但是，
     *              如果 L出现在星期字段里，而且在前面有一个数值 X，则表示“这个月的最后 X天”，例如， 6L表示该月的最后星期五；
     *          W ：该字符只能出现在日期字段里，是对前导日期的修饰，表示离该日期最近的工作日。例如 15W ，
     *              表示离该月 15号最近的工作日，如果该月 15号是星期六，则匹配 14号星期五；如果 15日是星期日，
     *              则匹配 16号星期一；如果 15号是星期二，那结果就是 15号星期二。但必须注意关联的匹配日期不能够 跨月，
     *              如你指定 1W，如果 1号是星期六，结果匹配的是 3号星期一，而非上个月最后的那天。W 字符串只能指定单一日期，而不能指定日期范围；
     *          LW 组合：在日期字段可以组合使用 LW，它的意思是当月的最后一个工作日；
     *          # ：该字符只能在星期字段中使用，表示当月某个工作日。如 6#3表示当月的第三个星期五(6表示星期五， #3表示当前的第三个)，
     *              而 4#5表示当月的第五个星期三，假设当月没有第五个星期三，忽略不触发；
     *          C ：该字符只在日期和星期字段中使用，代表“Calendar”的意思。它的意思是计划所关联的日期，
     *              如果日期没有被关联，则相当于日历中所有日期。例如 5 C 在日期字段中就相当于日历 5日以后的第一天。
     *              1C 在星期字段中相当于星期日后的第一天。Cron 表达式对特殊字符的大小写不敏感，对代表星期的缩写英文大小写也不敏感。
     *        例子：
     *              @Scheduled(cron = "0 0 1 1 1 ?")//每年一月的一号的 1:00:00 执行一次
     *              @Scheduled(cron = "0 0 1 1 1,6 ?") //一月和六月的一号的 1:00:00 执行一次
     *              @Scheduled(cron = "0 0 1 1 1,4,7,10 ?") //每个季度的第一个月的一号的 1:00:00 执行一次
     *              @Scheduled(cron = "0 0 1 1 * ?")//每月一号 1:00:00 执行一次
     *              @Scheduled(cron = "0 0 1 * * *") //每天凌晨 1 点执行一次
     *
     */
}
