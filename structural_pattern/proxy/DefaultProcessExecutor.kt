package structural_pattern.proxy

class DefaultProcessExecutor : IProcessExecutor {
    override fun executeProcess(idProcess: Int, user: String, password: String){
       println("process $idProcess in execution")
        println("process $idProcess finished")
    }
}