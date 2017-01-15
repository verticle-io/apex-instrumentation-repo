// A simple groovy script that gets executed on each instrumented method call
def execute(){
    println("method executed")

    // we have some implicit objects here like 'context' – AdvisorContext containing e.g
    // the instrumented instance
    def instance = context.getInstance()

    // message – our message object for APEX
    message.addField("msg", "read from minecraft EntityPlayerSP")

    // lets fetch the players health from the class instance
    message.addField("health", instance.dataWatcher.getWatchableObjectFloat(6));

    // and also log that to sysout
    println("instance:" + context.instance);
    println("health:" + context.instance.dataWatcher.getWatchableObjectFloat(6));

    // we could also access the method arguments via 'args' and 'argsCount'
    // – the number of arguments in the signature
    // arg1 ... argN – the arguments
    println("arg 1:" + arg1.toString())

    // the message object will now be sent to the apex service for further processing.

}
