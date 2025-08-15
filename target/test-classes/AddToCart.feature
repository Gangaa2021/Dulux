Feature: Add to Cart functionality

  Scenario: Verify add product to cart
    Given The user navigates to url
    When Accept Cookies
    Then click All Dulux
    And click Color Tester
    And click Color of Product
    And Add Quantity
    And Add To Cart
    When Proceed To Checkout
    Then Order Summary is displayed
    Then Take a screenshot
