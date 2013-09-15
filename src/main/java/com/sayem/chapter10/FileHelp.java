package com.sayem.chapter10;

// Demonstrate the file-based Help system.
class FileHelp {
    public static void main(String args[]) {
        Help hlpobj = new Help("helpfile.txt");
        String topic;

        System.out.println("Try the help system. " +
                "Enter 'stop' to end.");
        do {
            topic = hlpobj.getSelection();

            if(!hlpobj.helpon(topic))
                System.out.println("Topic not found.\n");

        } while(topic.compareTo("stop") != 0);
    }
}