
╔══════════════════════════╦═══════════╦═════════════════════════════════════╗
║        Operation         ║ ArrayList ║             LinkedList              ║
╠══════════════════════════╬═══════════╬═════════════════════════════════════╣
║ add                      ║ O(1)      ║ O(1)                                ║
║ get ith                  ║ O(1)      ║ O(n)                                ║
║ set ith                  ║ O(1)      ║ O(n)                                ║
║ remove ith               ║ O(n)      ║ O(n)                                ║
║ add to end               ║ O(1)      ║ O(n) [can be O(1) if we are clever] ║
║ insert before ith        ║ O(n)      ║ O(n)                                ║
║ insert/remove before ith ║ O(n)      ║ O(1)                                ║
║ traverse list with get   ║ O(n)      ║ O(n^2)                              ║
╚══════════════════════════╩═══════════╩═════════════════════════════════════╝

