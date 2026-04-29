solve(maze, (0,0), visited, path)                                  
│                                                                  
├── Mark (0,0) as visited                                          
│                                                                  
├── Try UP: (-1, 0) ─────────────► Invalid (out of bounds)         
│                                                                  
├── Try RIGHT: (0, 1)────────────► Valid!                          
│      │                                                           
│      └─── solve(maze, (0, 1), visited, path)                     
│           │                                                      
│           ├──Mark (0, 1) as visited                              
│           │                                                      
│           │                                                      
│           ├──Try UP: (-1, 1)─────► Invalid                       
│           ├──Try RIGHT: (0,2)────► Wall                          
│           ├──Try DOWN: (1,1) ────► Valid                         
│           │    │                                                 
│           │    │                                                 
│           │    └─solve(maze, (1,1), visited, path)               
│           │      │                                               
│           │      ├── Try all directions ... eventually finds path
│           │      │                                               
│           │      └── Returns true, path builds back up           
│           │                                                      
│           └──Try LEFT: (0,0)       Already visited               
│                                                                  
└──Return true, add positions back up the chain                   

Lets look at the call stack
┌──────────────────────────────────────────────────┐
│                                                  │
│  Call Stack (bottom to top):                     │
├──────────────────────────────────────────────────┤
│                                                  │
│  solve(maze, (4,4), ...) ◄───┐                   │
│                              │                   │
│                              └─BASE CASE         │
│                                                  │
│  solve(maze, (4,3), ...) ◄───┐                   │
│                              │                   │
│  solve(maze, (3,3), ...) ◄───┼──┬─               │
│                              │  │                │
│  solve(maze, (3,4), ...) ◄───┼──┼────            │
│                              │  │                │
│  solve(maze, (4,4), ...) ◄───┴──┴──┬────         │
│                                    │             │
│                                    │             │
│                                                  │
│                                (continues        │
│                                 backtracking up) │
│                                                  │
├──────────────────────────────────────────────────┤
│ When the exit is found                           │
│   - Each recursive call adds its position to the │
│                 path                             │
│   - The path builds from the exit back to the    │
│                 start                            │
│   - The call stack unwinds (returns) back to the │
│                 original call                    │
└──────────────────────────────────────────────────┘