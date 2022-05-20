JFLAGS = -g
JC = javac
JVM= java
FILE=

.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	aviao/view/Main.java \
	aviao/controller/Aviao.java \

MAIN = aviao/view/Main

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) aviao/view/*.class aviao/controller/*.class
	
run: $(MAIN).class
	$(JVM) $(MAIN) $(FILE)

