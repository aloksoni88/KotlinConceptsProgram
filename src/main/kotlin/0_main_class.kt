fun main(){
        val programType = 18
        when (programType){
                1 -> HelloWorld()
                2 -> exploreFirstApp()
                3 -> comment()
                4 -> variablesNDataTypes()
                5 -> kotlinBasics()
                6 -> dataTypes()
                7 -> stringInterpolcation()
                8 -> ranges()
                9 -> defaultFunction()
                10 -> ifExpression()
                11 -> whenExpression()
                12 -> forLoop()
                13 -> whileLoop()
                14 -> doWhile()
                15 -> breakKeyword()
                16 -> continueKeyword()
                17 -> funtionBasics()
                18 -> functionAsExpression()
                21 -> namedParameter()
                22 -> extensionFunctionsOne()
                23 -> extensionFunctionTwo()
                24 -> infixFunction()
                25 -> tailRecFunction()
                26 -> classAndConstructors()
                27 -> inheritance()
                28 -> overidingMethodsProperties()
                29 -> inheritancePrimarySecondaryConstructor()
                30 -> abstractClass()
                31 -> interfaceExample()
                32 -> dataClass()
                33 -> objectDeclaration()
                34 -> companianObject()
                35 -> lambdasHighOrderFun1()
                36 -> lambdasHighOrderFun2()
                37 -> lambdasExampleTwo()
                38 -> lambdasClosures()
                39 -> withApplyFunctions()
                40 -> arrays()
                41 -> listExample()
                42 -> mapHashMap()
                43 -> setHashSet()
                44 -> filterMapSorting()
                45 -> predicateExample()
                46 -> nullSafety()
                47 -> lateinitKeyword()
                48 -> lazyKeyword()
                49 -> withScopeFunction()
                50 -> applyScopeFunction()
                51 -> alsoScopeFunction()
                52 -> letScopeFunction()
                53 -> runScopeFunction()
                54 -> myKotlinInteroperability()
                55 -> myKotlinInteroperability()
                60 -> threadExample()
                61 -> firstCoroutine()
                62 -> runBlockingAndDelay()
                63 -> customSuspendingFunction()
                64 -> launchCoroutineBuilder()
                65 -> asyncCoroutineBuilder()
                66 -> aRunBlockingCoroutineBuilder()
                68 -> cooperativeCoroutineSuspendFunction()
                69 -> isActiveFlagCooperativeCoroutine()
                70 -> exceptionHandling()
                71 -> withContextCoroutineBuilder()
                72 -> withTimeoutCoroutineBuilder()
                73 -> withTimeoutOrNullCoroutineBuilder()
                74 -> sequentialSuspendingFunctions()
                75 -> concurrencyWithinCoroutine()
                76 -> lazyAsync()
                77 -> coroutineScope()
                78 -> coroutineContextAndDispatchers()
                else->{
                   println("No Program find ")
                }
        }

}