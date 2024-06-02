# Mahfil App Test Case and Bug Report Summary
## Introduction
This document summarizes the testing process for the Mahfil Mobile App, focusing on various functionalities including registration, login, video content accessibility, user interactions, performance, and download features. The testing process aimed to ensure a seamless and bug-free experience for users. For detailed view please download the Excel file.


## Test Case Summary

### User Authentication

#### SignUp

- **TC-1:** Verify that UI element for Registration displayed correctly. **Status:** Failed
- **TC-2:** Verify registration using Google account. **Status:** Passed
- **TC-3:** Verify canceling Google login does not register user. **Status:** Passed
- **TC-4:** Verify error message for invalid Google account. **Status:** Passed
- **TC-5:** Verify registration using email and OTP. **Status:** Passed
- **TC-6:** Verify error message for invalid email format. **Status:** Failed
- **TC-7:** Verify error message for already registered email. **Status:** Failed
- **TC-8:** Verify resend OTP functionality. **Status:** Passed
- **TC-9:** Verify error message for incorrect OTP. **Status:** Passed
- **TC-10:** Verify error message for expired OTP. **Status:** Failed
- **TC-11:** Verify valid name and phone number completes registration. **Status:** Passed
- **TC-12:** Verify error message for empty name or phone number fields. **Status:** Failed
- **TC-13:** Validate all mandatory fields during registration. **Status:** Failed

#### Continue with Google

- **TC-3:** Verify canceling Google login does not register user. **Status:** Passed
- **TC-4:** Verify error message for invalid Google account. **Status:** Passed

#### Continue with Email

- **TC-5:** Verify registration using email and OTP. **Status:** Passed
- **TC-6:** Verify error message for invalid email format. **Status:** Failed
- **TC-7:** Verify error message for already registered email. **Status:** Failed
- **TC-8:** Verify resend OTP functionality. **Status:** Passed
- **TC-9:** Verify error message for incorrect OTP. **Status:** Passed
- **TC-10:** Verify error message for expired OTP. **Status:** Failed
- **TC-11:** Verify valid name and phone number completes registration. **Status:** Passed
- **TC-12:** Verify error message for empty name or phone number fields. **Status:** Failed
- **TC-13:** Validate all mandatory fields during registration. **Status:** Failed

#### Continue Another Way

- **TC-15:** Verify registration using mobile number, OTP, name, and email. **Status:** Passed
- **TC-16:** Verify error message for invalid mobile number. **Status:** Failed
- **TC-17:** Verify error message for incorrect OTP. **Status:** Passed
- **TC-18:** Verify error message for expired OTP. **Status:** Failed
- **TC-19:** Verify valid name and email completes registration. **Status:** Passed
- **TC-20:** Verify error message for empty name or email fields. **Status:** Failed
- **TC-21:** Verify error message for invalid email format. **Status:** Failed
- **TC-22:** Validate all mandatory fields during registration. **Status:** Failed

#### Sign In

- **TC-23:** Verify sign in using Google account. **Status:** Passed
- **TC-24:** Verify error message for invalid Google account. **Status:** Passed
- **TC-25:** Verify sign in using registered email. **Status:** Passed
- **TC-26:** Verify error message for unregistered email. **Status:** Failed
- **TC-27:** Verify sign in using registered phone number. **Status:** Passed
- **TC-28:** Verify error message for unregistered phone number. **Status:** Failed

### Content Categories

- **TC-29:** Verify "Lecture" category is accessible and functional. **Status:** Passed
- **TC-30:** Verify "Nasheed" category is accessible and functional. **Status:** Passed
- **TC-31:** Verify "Telawat" category is accessible and functional. **Status:** Passed

### Video Streaming Functionality

- **TC-32:** Verify lecture videos load and play smoothly. **Status:** Passed
- **TC-33:** Verify Nasheed videos load and play smoothly. **Status:** Passed
- **TC-34:** Verify Telawat videos load and play smoothly. **Status:** Passed
- **TC-35:** Verify Other videos load and play smoothly. **Status:** Passed
- **TC-36:** Verify video play and pause functionality. **Status:** Passed
- **TC-37:** Verify autoplay functionality. **Status:** Passed
- **TC-38:** Verify video buffering functionality. **Status:** Passed
- **TC-39:** Verify video loading time. **Status:** Passed
- **TC-40:** Verify video quality adjustment functionality. **Status:** Passed
- **TC-41:** Verify video controls visibility and functionality. **Status:** Passed
- **TC-42:** Verify full-screen playback functionality. **Status:** Passed
- **TC-43:** Verify unique video content for all categories. **Status:** Passed
- **TC-44:** Verify content alignment with Islamic principles. **Status:** Passed
- **TC-45:** Verify no inappropriate content is present. **Status:** Passed
- **TC-46:** Verify download functionality for offline viewing. **Status:** Failed

### Search Functionality

- **TC-47:** Verify basic search functionality by title. **Status:** Passed
- **TC-48:** Verify search functionality by keyword. **Status:** Passed
- **TC-49:** Verify search functionality by category. **Status:** Passed
- **TC-50:** Verify search with no results displays appropriate message. **Status:** Failed
- **TC-51:** Verify search auto-suggestions functionality. **Status:** Failed

### User Interaction

- **TC-52:** Verify liking a video updates the like count. **Status:** Passed
- **TC-53:** Verify unliking a video updates the like count. **Status:** Passed
- **TC-54:** Verify adding a comment to a video is functional. **Status:** Passed

## Bug Report Summary

| Bug ID | Module                               | Bug Description | Environment                    | Steps to Execute                                                                                                                                                           | Expected Result                                                                                             | Actual Result                                                                                                     |
|--------|--------------------------------------|-----------------|--------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|
| TC-1   | Sign up/ Create Account Button       | The sign up/Create account button isn't easily visible | OS: Android 13, Device: Vivo Y22 | 1) Open the app 2) Click on the navbar icon on the top right corner 3) Scroll down and click on the Sign in button | There should be a SignUp button/ Create Account link for better UI                       | Not found as per expectation                                                                                       |
| TC-6   | SignUp:: Continue with Email         | For entering an invalid email format there should be shown an appropriate error message | OS: Android 13, Device: Vivo Y23 | 1) Open the app, 2) Click on the navbar icon, 3) Scroll down and click on Sign in, 4) Select "Continue with Email", 5) Enter an invalid email address | An error message is displayed indicating the email format is invalid                         | Not found as per expectation                                                                                       |
| TC-7   | SignUp:: Continue with Email         | Verify that trying to register with an already registered email shows an appropriate error message. | OS: Android 13, Device: Vivo Y24 | 1) Open the app, 2) Click on the navbar icon, 3) Scroll down and click on Sign in, 4) Select "Continue with Email", 5) Enter an email address that is already registered | An error message is displayed indicating the email is already in use                           | Not found as per expectation                                                                                       |
| TC-10  | SignUp:: Continue with Email         | Verify that an expired OTP shows an appropriate error message | OS: Android 13, Device: Vivo Y25 | 1) Open the app 2) Click on the navbar icon 3) Scroll down and click on Sign in 4) Select "Continue with Email" 5) Enter a valid email address 6) Click on the "Send OTP" button 7) Wait for the OTP to expire (120s), 8) Enter the expired OTP in the app | An error message is displayed indicating the OTP has expired                               | Not found as per expectation                                                                                       |
| TC-12  | SignUp:: Continue with Email         | Verify that leaving the name or phone number fields empty shows appropriate error messages | OS: Android 13, Device: Vivo Y26 | 1) Open the app 2) Click on the navbar icon 3) Scroll down and click on Sign in 4) Select "Continue with Email" 5) Enter a valid email address 6) Click on the "Send OTP" button 7) Enter the received OTP in the app, 8) Leave the name or phone number field empty phone number 9) Click on the "Save" button | An error message is displayed indicating that the name or phone number is required       | Not found as per expectation                                                                                       |
| TC-13  | SignUp:: Continue with Email         | Verify that all mandatory fields (email, OTP, name, phone number) are validated | OS: Android 13, Device: Vivo Y27 | 1) Open the app 2) Try to register without filling in the required fields | Appropriate error messages are displayed indicating the mandatory fields                | Not found as per expectation                                                                                       |
| TC-18  | Sign Up:: Continue another way:: Log in with Mobile | Verify that an expired OTP shows an appropriate error message | OS: Android 13, Device: Vivo Y28 | 1) Open the app 2) Click on the navbar icon 3) Scroll down and click on Sign in 4) Select "Continue another way" 5) Enter a valid phone number 6) Click on the "Send OTP" button 7) Wait for the OTP to expire 8) Enter the expired OTP in the app | An error message is displayed indicating the OTP has expired                               | Not found as per expectation                                                                                       |
| TC-20  | Sign Up:: Continue another way:: Log in with Mobile | Verify that leaving the name or email fields empty shows appropriate error messages | OS: Android 13, Device: Vivo Y29 | 1) Open the app 2) Click on the navbar icon 3) Scroll down and click on Sign in 4) Select "Continue another way" 5) Enter a valid phone number 6) Click on the "Send OTP" button 7) Leave the name or email field empty 8) Click on the "Save" button | An error message is displayed indicating that the name or email is required               | Not found as per expectation                                                                                       |
| TC-21  | Sign Up:: Continue another way:: Log in with Mobile | Verify that entering an invalid email format shows an appropriate error message | OS: Android 13, Device: Vivo Y30 | 1) Open the app 2) Click on the navbar icon 3) Scroll down and click on Sign in 4) Select "Continue another way" 5) Enter a valid phone number 6) Click on the "Send OTP" button 7) Enter an invalid email format 8) Click on the "Save" button | An error message is displayed indicating the email format is invalid                       | Not found as per expectation                                                                                       |
| TC-22  | Sign Up:: Continue another way:: Log in with Mobile | Verify that all mandatory fields (Phone, OTP, name, email) are validated | OS: Android 13, Device: Vivo Y31 | 1) Open the app 2) Try to register without filling in the required fields | Appropriate error messages are displayed indicating the mandatory fields                | Not found as per expectation                                                                                       |
| TC-26  | Sign in:: Continue with Email        | Verify that entering an unregistered email shows an appropriate error message | OS: Android 13, Device: Vivo Y32 | 1) Open the app 2) Click on the navbar icon 3) Scroll down and click on Sign in 4) Select "Continue with Email" 5) Enter the unregistered email address | An error message is displayed indicating that the email is not registered                | Not found as per expectation, rather it takes the invalid email as a new user                                      |
| TC-28  | Sign in:: Continue with Email        | Verify that entering an unregistered phone number shows an appropriate error message | OS: Android 13, Device: Vivo Y33 | 1) Open the app 2) Click on the navbar icon 3) Scroll down and click on Sign in 4) Select "Continue another Way" 5) Enter the unregistered phone number | An error message is displayed indicating that the email is not registered                | Not found as per expectation, rather it takes the invalid phone number as a new user                               |
| TC-46  | Download Video for Offline Viewing   | Verify that users can download videos for offline viewing | OS: Android 13, Device: Vivo Y34 | 1) Open the app 2) Navigate to a video 3) Click on the download button 4) Wait for the video to download | The video downloads successfully and is available for offline viewing                     | Not found as per expectation, rather the app prompts the user to upgrade to a premium account and does not allow the video to be downloaded |
| TC-51  | Search Auto-Suggestions              | Verify that the search bar provides auto-suggestions based on partial input | OS: Android 13, Device: Vivo Y35 | 1) Open the app 2) Navigate to the search bar 3) Enter the first few letters of a known video title or keyword | The search bar provides a list of auto-suggestions based on the entered partial input   | Not found as per expectation                                                                                       |
| TC-58  | App Opening                          | Verify that users can open the without wifi or cellular data | OS: Android 13, Device: Vivo Y36 | 1) Turn off the wifi or cellular data 2) Open the app | The app opens successfully                                                              | Not found as expected, a popup shows, "Oops! There is no internet connection. Please check your modem or router or reconnect to Wi-Fi" |
