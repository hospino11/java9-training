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
