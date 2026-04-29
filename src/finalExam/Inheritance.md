Simple example of inheritance
┌────────────────────┐  
│       Person       │  
├────────────────────┤  
│ * String firstName │  
│ * String lastName  │  
│ * int age          │  
├────────────────────┤  
│ + getFullName()    │  
│ + getAge()         │  
│ + introduce()      │  
└────────────────────┘  
           ▲            
           │            
extends    │            
           │            
┌──────────┴─────────┐  
│      Student       │  
├────────────────────┤  
│ * String studentId │  
│ * double gpa       │  
├────────────────────┤  
│ + getStudentId()   │  
│ + getGpa()         │  
│ + introduce() ◄────┼── needs to override parent method
└────────────────────┘  


Let's now see an example with an abstract parent class
            ┌────────────────────┐                           
            │      Animal        │                           
            │      abstract      │◄─────┐                    
            ├────────────────────┤      │                    
            │ * String name      │      │                    
            │ * int age          │      │                    
            ├────────────────────┤      │extends             
            │ + getName()        │      │                    
            │ + getAge()         │      │                    
Abstract───►│ + makeSound()      │      │                    
            └────────────────────┘      │                    
                                        │                    
                                        │                    
                      ┌─────────────────┴───────┐            
                      │                         │            
                      │                         │            
            ┌─────────┴──────────┐  ┌───────────┴─────────┐  
            │       Dog          │  │         Cat         │  
            ├────────────────────┤  ├─────────────────────┤  
            │ * String breed     │  │ * String breed      │  
            ├────────────────────┤  ├─────────────────────┤  
     ┌─────►│ + makeSound()      │  │ + makeSound() ◄─────┼─┐
     │      │ + fetch()          │  │ + doCatStuff()      │ │
     │      └────────────────────┘  └─────────────────────┘ │
     │                                                      │
     │                                                      │
     └──────────────────────────┬───────────────────────────┘
                                │                            
                            Both overrides                   
                            the abstract method              
                            from parent class                