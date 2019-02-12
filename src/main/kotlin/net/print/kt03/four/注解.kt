package net.print.kt03.four

/**
 * 注解，是将元数据附加到代码中。元数据信息由注解kotlin.Metadata定义
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
internal annotation class Metadata
