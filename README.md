# FlowChartMaker -textToFlowChart
## Befin Babu


FlowChartMaker-textToFlowChart is a Java-Based application to convert texual input to a FlowChart.


- Use this explain your idea to your boss.
- or just create your own development plan.


## Usage

- Type your input into Input/ip.c
- run Java program src/com/flowChartMaker/astMaker.java
- get the Output flowChart flow.png from  the output folder.



## Dependancies



- Graphviz should be installed and added to path.
    ```
    brew install graphviz
    ```


## Input Format

- The input format borrows lightly from the C syntax.
- The input support If,If_Else,While etc..

For Example :
```
  A; 
  B; 
  if(C){
    D;
  }
  else{
    E;
  }
  F;
```

![alt text](https://github.com/b3f815/flowChartMaker/blob/master/output/flow.png?raw=true)

Peace ✌️.
