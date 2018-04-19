package com.jesusgsdev;


import java.lang.management.ManagementFactory;
import java.util.stream.Stream;

public class ProcessReview {

    public static Long getProcessId(){
        //We needed to do this on Java 8
        Long processId = Long.parseLong(ManagementFactory.getRuntimeMXBean().getName().split("@")[0]);

        //It's much simpler in Java 9
        return ProcessHandle.current().pid();
    }

    public static Stream<ProcessHandle> getRunningProcess(){
        //Example of printing out current running processes
        ProcessHandle.allProcesses().map(ProcessHandle::info).forEach(ProcessReview::printInfo);

        return ProcessHandle.allProcesses();
    }

    /**
     * Print information about a running process
     * @param info
     */
    private static void printInfo(ProcessHandle.Info info){
        if(info.startInstant().isPresent() && info.command().isPresent()){
            System.out.println("Started at: " + info.startInstant().get() + ", Command: " + info.command().get());
        }
    }

}
