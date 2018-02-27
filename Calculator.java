class Calculator {
 private Double result;

public Calculator(){
 this.result = 0.0;
}

public void setResult(Double newValue){
 this.result = newValue;
}

public Double getResult(){
 return result;
}

public void sum(Double n1, Double n2){
 Double resultSum = n1 + n2;
 setResult(resultSum);
} 

}