# java9-training
Java 9 Udemy course

# Topics
- module-info.java

## Stream Enhancements
### takeWhile
Returns a subset of elements of the given stream that matches the given predicate.
The Stream interrupts the process when any element no matches the given predicate.
This is a default method of Stream interface.
### dropWhile
It's the oppposite of `takeWhile`. This method skip the elements in the Stream while the given predicate is `true`.
After the predicate is false, the Stream gets of rest of the elements in the new Stream.
### iterate
The Java 9 version has a plus. This receives a predicate that allows to set a breaking conditional of the infinite elements' generation process.
### ofNullable
This improves the code avoiding null streams or null check of streams. In case of the stream is null, the output will be an empty stream.
This is useful in `flatMap` operation.

## Interface enhancements
### `private static` method
This new kind of methods can be used by another static methods or default methods only.
### `private` method
This new kind of methods can be used by another private methods or default methods only.

## Factory Methods Immutable Collections
### List
- `null` elements not allowed (`java.lang.NullPointerException`).
- Any modification on the collection not allowed (`java.lang.UnsupportedOperationException`).
### Set
- `null` elements not allowed (`java.lang.NullPointerException`).
- Any modification on the collection not allowed (`java.lang.UnsupportedOperationException`).
- Elements duplication not allowed (`java.lang.IllegalArgumentException`).
### Map
- `null` keys and values not allowed (`java.lang.NullPointerException`).
- Any modification on the collection not allowed (`java.lang.UnsupportedOperationException`).
- Keys duplication not allowed (`java.lang.IllegalArgumentException`).

## Resource
### Advantages
- Fewer lines of code
- Readability
- No need for `finally` anymore
- Resource auto-close
- Try with resource

## Diamond operator
The new enhancement is about the diamond operator usage in anonymous classes. 

## Process API
- Till Java 8 communication with process, operating system and machine is difficult.
- We have to write code based on OS.
- To overcome this area Java 9 came with lot of process API enhancements.
### What we can do?
- Getting the PIP - Process ID.
- Create new process.
- Destroying running process.
- Getting parent and child process details.
- Getting process details like owner and permissions.
### Java 9 enhancements
- Several new methods added - pip and info. Process class.
- Process builder to create your own process. ProcessBuilder class.
- We can access the current process, parent, child, etc. ProcessHandle class.
- Provide details about process. ProcessHandleInfo class.
### ProcessHandle
ProcessHandle allows us to get the current running process information.  
