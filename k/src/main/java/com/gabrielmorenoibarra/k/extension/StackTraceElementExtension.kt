package com.gabrielmorenoibarra.k.extension

fun StackTraceElement.generateTag() = className.substringAfterLast(".")

fun StackTraceElement.generateMessage(msg: Any) = "$methodName() $msg"
