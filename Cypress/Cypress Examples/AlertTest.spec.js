// AlertTest.spec.js created with Cypress
//
// Start writing your Cypress tests below!
// If you're unfamiliar with how Cypress works,
// check out the link below and learn how to write your first test:
// https://on.cypress.io/writing-first-test
describe('Alert Test', function () {
    // test case
    it('Scenario 1', function (){
       // launch url
       cy.visit("https://register.rediff.com/register/register.php");
       // click submit
       cy.get('input[type="submit"]').click();
       // fire event with method on
       cy.on('window:alert',(t)=>{
          //assertions
          expect(t).to.contains('Your full name');
       })
    });
 });