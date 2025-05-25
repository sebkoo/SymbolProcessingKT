package com.bKoo.builderKSP

object KotlinSymbolProcessing {
    /*
        - analyze source code and generate
        - new source code
        - compile
        - access methods/functionality at COMPILE TIME
     */

    // Use-case: generate builder patterns for data classes
    data class Person(val name: String, val age: Int)

    /*
        PersonBuilder.
            .name("Daniel")
            .age(99)
            .property(value)
            ...
            .build()
     */

    // module 1 - symbol definitions (annotations)
    // module 2 - KSP logic for generating the source
    // module 3 - source + the place where the generated source will be created
}