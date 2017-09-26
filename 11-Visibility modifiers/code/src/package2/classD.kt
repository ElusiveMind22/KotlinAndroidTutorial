package package2

import package1.ClassA

public open class ClassD {
    //private var y = 1
    public open var z = 10
    protected open val p1 = 1
    init {
        println("Inilialize ClassD")
    }
}

class SubClassD: ClassD() {
    override val p1 = 2
    override var z = 200
    init {
        println("Access p1. p1 = $p1")
    }
}
public fun function4() {
    println("This is function4")
    var classA = ClassA()
    var subClassD = SubClassD()
//    subClassD.p1
}