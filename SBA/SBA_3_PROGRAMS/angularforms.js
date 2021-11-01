describe("Angular forms test", function () {
  
  var male = element(by.model('Male'));
  var female= element(by.model('Female'));
  var terms = element(by.model("terms"));
  var subjects = element(by.model("subjects"));
  var reset = element(by.css('[ng-click="reset()"]'));
  var fname = element(by.model("firstName"));
  var lname = element(by.model("lastName"));
  var em = element(by.model("email"));
  var s = element(by.model("save"));
  beforeEach(function () {
    browser.get("http://192.168.56.1:8080/OneDrive/Desktop/Angular1.7.html");
  });

  it("Title test", function () {
    expect(browser.getTitle()).toEqual("Angular JS Forms");
  });

  it("Gender:Male Test", function () {
    male.click();
    expect(male.isSelected()).toBe(true);
  });
  it("Gender:Female Test", function () {
    female.click();
    expect(female.isSelected()).toBe(true);
  });

  it("Terms and conditions checkbox test", function () {
    expect(terms.isSelected()).toBe(false);
    terms.click();
    expect(terms.isSelected()).toBe(true);
  });

  it("Subjects dropdown test", function () {
    subjects.$('[value="AngularJs"]').click();
    expect(subjects.$('[value="AngularJs"]').isSelected()).toBe(true);
    subjects.$('[value="NodeJs"]').click();
    expect(subjects.$('[value="NodeJs"]').isSelected()).toBe(true);
    subjects.$('[value="React Js"]').click();
    expect(subjects.$('[value="React Js"]').isSelected()).toBe(true);
    subjects.$('[value="others"]').click();
    expect(subjects.$('[value="others"]').isSelected()).toBe(true);
  });

  it("Required warning for first name is displayed or not  test", function () {
    fname.clear();
    expect(
      element(
        by.css('[ng-show="studentForm.firstname.$error.required"]')
      ).isDisplayed()
    ).toBeTruthy();
  });

  it("Required warning for last name is displayed or not  test", function () {
    lname.clear();
    expect(
      element(
        by.css('[ng-show="studentForm.lastname.$error.required"]')
      ).isDisplayed()
    ).toBeTruthy();
  });

  it("Required warning for email is displayed or not  test", function () {
    em.clear();
    expect(
      element(
        by.css('[ng-show="studentForm.email.$error.required"]')
      ).isDisplayed()
    ).toBeTruthy();
  });

  it("Invalid email warning  test", function () {
    em.clear();
    em.sendKeys("abcdefg");
    expect(
      element(
        by.css('[ng-show="studentForm.email.$error.email"]')
      ).isDisplayed()
    ).toBeTruthy();
  });
  it("valid email test", function () {
    em.clear();
    em.sendKeys("abcd@gmail.com");
    expect(
      element(
        by.css('[ng-show="studentForm.email.$error.email"]')
      ).isDisplayed()
    ).toBeFalsy();
  });

  it("Reset is Working or Not", function () {
    fname.sendKeys("Arun");
    lname.sendKeys("Raghav");
    reset.click();
    expect(fname.getAttribute("value")).toEqual("Mahesh");
    expect(lname.getAttribute("value")).toEqual("Parashar");
    expect(em.getAttribute("value")).toEqual(
      "MaheshParashar@tutorialspoint.com"
    );
    expect(female.isSelected()).toBe(false);
    expect(terms.isSelected()).toBe(false);
  });
  it(" checking the tagName", function () {
    expect(fname.getTagName()).toEqual("input");
  });

  it(" checking the  tag name", function () {
    expect(terms.getAttribute("value")).toEqual("accept");
  });
  it("submit button enable check", function () {
    var submit = element(by.css('[ng-click="submit()"]'));
    submit.click();

    expect(submit.isEnabled()).toBe(true);
  });
});
