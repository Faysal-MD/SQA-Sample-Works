# Mahfil App Testing Summary

## Introduction
This document summarizes the testing process for the Mahfil Mobile App, focusing on various functionalities including registration, login, video content accessibility, user interactions, performance, and download features. The testing process aimed to ensure a seamless and bug-free experience for users. For detailed view please download the Excel file.

# Test Cases
## User Authentication

### SignUp

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

### Continue with Google

- **TC-3:** Verify canceling Google login does not register user. **Status:** Passed
- **TC-4:** Verify error message for invalid Google account. **Status:** Passed

### Continue with Email

- **TC-5:** Verify registration using email and OTP. **Status:** Passed
- **TC-6:** Verify error message for invalid email format. **Status:** Failed
- **TC-7:** Verify error message for already registered email. **Status:** Failed
- **TC-8:** Verify resend OTP functionality. **Status:** Passed
- **TC-9:** Verify error message for incorrect OTP. **Status:** Passed
- **TC-10:** Verify error message for expired OTP. **Status:** Failed
- **TC-11:** Verify valid name and phone number completes registration. **Status:** Passed
- **TC-12:** Verify error message for empty name or phone number fields. **Status:** Failed
- **TC-13:** Validate all mandatory fields during registration. **Status:** Failed

### Continue Another Way

- **TC-15:** Verify registration using mobile number, OTP, name, and email. **Status:** Passed
- **TC-16:** Verify error message for invalid mobile number. **Status:** Failed
- **TC-17:** Verify error message for incorrect OTP. **Status:** Passed
- **TC-18:** Verify error message for expired OTP. **Status:** Failed
- **TC-19:** Verify valid name and email completes registration. **Status:** Passed
- **TC-20:** Verify error message for empty name or email fields. **Status:** Failed
- **TC-21:** Verify error message for invalid email format. **Status:** Failed
- **TC-22:** Validate all mandatory fields during registration. **Status:** Failed

### Sign In

- **TC-23:** Verify sign in using Google account. **Status:** Passed
- **TC-24:** Verify error message for invalid Google account. **Status:** Passed
- **TC-25:** Verify sign in using registered email. **Status:** Passed
- **TC-26:** Verify error message for unregistered email. **Status:** Failed
- **TC-27:** Verify sign in using registered phone number. **Status:** Passed
- **TC-28:** Verify error message for unregistered phone number. **Status:** Failed

## Content Categories

- **TC-29:** Verify "Lecture" category is accessible and functional. **Status:** Passed
- **TC-30:** Verify "Nasheed" category is accessible and functional. **Status:** Passed
- **TC-31:** Verify "Telawat" category is accessible and functional. **Status:** Passed

## Video Streaming Functionality

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

## Search Functionality

- **TC-47:** Verify basic search functionality by title. **Status:** Passed
- **TC-48:** Verify search functionality by keyword. **Status:** Passed
- **TC-49:** Verify search functionality by category. **Status:** Passed
- **TC-50:** Verify search with no results displays appropriate message. **Status:** Failed
- **TC-51:** Verify search auto-suggestions functionality. **Status:** Failed

## User Interaction

- **TC-52:** Verify liking a video updates the like count. **Status:** Passed
- **TC-53:** Verify unliking a video updates the like count. **Status:** Passed
- **TC-54:** Verify adding a comment to a video is functional. **Status:** Passed
