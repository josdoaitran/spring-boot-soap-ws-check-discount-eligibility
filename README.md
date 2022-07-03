# spring-boot-soap-ws-make-loan-decision
## WSDL (Web Service Description Language)
WSDL is an XML notation for describing a web service. A WSDL definition tells a client how to compose a web service request and describes the interface that is provided by the web service provider.

## Use Case of Loan Decision service
Expose the API to verify who will be eligibility to apply Loan for a customer.
- 
- Desired input:
  + `CustomerName`
  + `Age`
  + `Income`
  + `CIBIL Score`
  + `Employee Mode`
  
- Response of API:
  + `Eligible Loan`
  + `Approve Amount`
  + `Mismatch Criteria`

## Reference:
- https://spring.io/
- https://github.com/Java-Techie-jt/spring-boot-soap-ws