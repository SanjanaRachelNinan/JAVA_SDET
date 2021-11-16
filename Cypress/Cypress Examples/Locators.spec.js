// Locators.spec.js created with Cypress
//
// Start writing your Cypress tests below!
// If you're unfamiliar with how Cypress works,
// check out the link below and learn how to write your first test:
// https://on.cypress.io/writing-first-test
describe('Locators example', function() {
     
    it('types of locators', function() {
      cy.visit("https://demo.nopcommerce.com/")
      cy.get("#small-searchterms").type("Apple MacBook Pro 13-inch")
      cy.get("[type='submit']").click()
      cy.get("[class='button-2 product-box-add-to-cart-button']").click()
      cy.wait(5000)
      cy.get("[class='prices']").contains('$1,800.00')
    })

})
