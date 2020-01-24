package com.juullabs.exercise.annotations

import kotlin.reflect.KClass

/** Actual type used by [Exercise]. Usually, use [Extra] or [Argument] aliases instead. */
@Target
@MustBeDocumented
@Retention(AnnotationRetention.SOURCE)
annotation class ExerciseParameter(
    val name: String,
    val type: KClass<*>,
    val optional: Boolean = false
)

/** Type used by [Exercise] on an `Activity`. */
typealias Extra = ExerciseParameter

/** Type used by [Exercise] on a `Fragment`. */
typealias Argument = ExerciseParameter
