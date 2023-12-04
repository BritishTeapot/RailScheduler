# RailScheduler

## Goal

RailScheduler is a program that calculates optimal train schedules, eliminating delays, decreasing padding, optimizing platform usage.



## Representation

### Definitions

**Definition:**  *Piece of Track*, or just *Track*, is a string. It represents a reasonably sized part of railroad track. We will assume that all Tracks have the same lenght.

**Definition:**  *Rail Network*, or just *Network*, is a directed graph of Tracks. This graph is supposed to represent a railroad network, where each vertex is a piece of Track, and verticies are linked if and only if it is possible to go directly from one piece of track to another using an appropriate viechle. Direction of the links represents a way in which trains are allowed to move.

**Definition:**  *Track Section*, or just *Section* is a set of Tracks. It is supposed to represent a section of railroad such that for each Track in the section there exists another Track in the same section such that if we place trains in both of them trains will inevitably collide.

**Definition:**  *Train Route*, or just *Route* is a path in a Rail Network.

**Definition:**  *Schedule* is a tuple (N, S, R) where N is a Network, S is a set of Sections,
R is a set of routes, and for each two Sections s1, s2 in S their intersection is an empty set.

**Definition:**  Let C=(N, S, R) be some Schedule. Then, if for any Routes r1, r2 in R and for any natural i less or equal than the size of the smaller route(out of r1, r2) there exists such Section s in S that s contains both i-th element in r1, and i-th element in r2 path, we say that there is a *Collision between routes r1 and r2*.
