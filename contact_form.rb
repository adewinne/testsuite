require 'rubygems'
require 'selenium-webdriver'
wd = Selenium::WebDriver.for :firefox

wd.get "http://therefore.ca/contact"
wd.find_element(:css, "div.col-sm-6").click
wd.find_element(:id, "name").click
wd.find_element(:id, "name").clear
wd.find_element(:id, "name").send_keys "test"
wd.find_element(:id, "email").click
wd.find_element(:id, "email").clear
wd.find_element(:id, "email").send_keys "adewinne@gmail.com"
wd.find_element(:id, "comment").click
wd.find_element(:id, "comment").clear
wd.find_element(:id, "comment").send_keys "test message"
wd.find_element(:xpath, "//form[@id='contact-form']//button[.='Email us  ']").click
wd.quit
