// package points to remember;

 //1.static on the nested class removes the inner-outer link. 
 // Normally, a non-static inner class carries a hidden reference back to its enclosing object (like a hidden stacksusingAL.this pointer),
 //  which is why you'd otherwise need outer.new Stack() to create it. Marking Stack as static says "I don't need that link" — so you can create it directly with new Stack(), no outer object required. That's exactly what your main method needs, since main is static and never creates a stacksusingAL instance.
// So to state it cleanly:

// static class Stack → independent of the outer class instance (no inner-outer link) ✅
 
// static fields/methods inside Stack → independent of nothing — actually the opposite! It makes all Stack objects share the same data,
//  which is a different kind of "static" doing a different job.

// These are two separate uses of the same keyword, and it's easy to blur them together since they're stacked right next to each other in your code. 
// The class-level static is about outer-inner class relationship. The field/method-level static is about whether data is shared across all objects of that class or unique per object.
 