// Trick 1: "Which" vs "How many"
// Scan the question for the words "which" or "print the sequence/order" vs "how many" or "maximum count."

// "Which activities got selected" → need id
// "Maximum number of activities" → no id needed

// This is the single fastest filter — train your eye to catch "which" / "print" / "sequence" as red flags.

// Trick 2: "Will I sort this?"
// Before writing any code, ask: am I going to reorder this array at some point? If yes, immediately ask the follow-up: will I need to trace an element back to its original position after that? If both yes → stamp an id before sorting, not after (once sorted, the original position is gone forever).

// Trick 3: The "3+ properties" rule for classes
// Count the properties per item in your head as you read:

// 2 properties (start/end, coins value) → plain array is fine
// 3+ properties (id, deadline, profit) → make a class, because array indices like arr[i][2] stop being readable fast

// Trick 4: "Print" in the output spec = build an ans list
// If the question says "print the selected activities/jobs," that's your cue you'll need an ArrayList to collect results as you go (not just a counter variable) — because you can't print something you never stored.

// Trick 5: A simple phrase to say to yourself
// "Sorting destroys position. If I need position later, I save it now."
// Say this every time you write Arrays.sort(...) or Collections.sort(...). It'll become automatic within a handful of problems.

// Quick self-test while reading any greedy problem:

// Am I sorting? → if yes, what am I sorting by?
// Does the output need to reference original items (ids, indices)? → if yes, add id field before sorting
// How many properties per item? → 3+ means use a class
// Does output say "print/which/sequence"? → need an ans list, not just a counter

// Run through these 4 in ~10 seconds while reading the problem statement, before you write a single line of code. Over the next few problems this'll stop being a conscious checklist and just become how you read the question.


