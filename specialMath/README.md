# specialMath
CLI tool for calculating terms of the integer sequence
```
f(N) = N + f(N-1) + f(N-2)
```
with initial terms `f(0) = 1` and `f(1) = 1`.

## Usage
```
$ docker run ehontz/specialmath N
```
where `N` is the term of the sequence to calculate.

There is also a help message available via the `-h|--help` flag:
```
$ docker run ehontz/specialmath -h
specialMath 1.0.0
Usage: specialMath N
specialMath calculates the Nth term in the integer sequence defined by
  f(N) = N + f(N-1) + f(N-2)
with initial terms f(0) = 0 and f(1) = 1
         
  -h, --help      Show help message
  -v, --version   Show version of this program

 trailing arguments:
  N (required)   Term to calculate.
```

**Note**: Running via the sbt console or running the Bash entry point of the .zip distribution (`bin/specialmath`) is _significantly_ faster than with `docker run`, due to the container startup time.

## Developer
This is an sbt project.


### Compile
```
> sbt compile
```

### Create docker image
```
> sbt Docker/publishLocal
```

### Create a .zip distribution
```
> sbt dist
```

### Test
```
> sbt test
```