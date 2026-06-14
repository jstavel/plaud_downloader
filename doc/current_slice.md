# Vision
It is easy for AI to implement given use case.

# Use Case
User provides port number.
System connects browser using CDP protocol. The service runs at localhost.
System opens page `www.plaud.ai` and returns title of the page.
System uses clj-chrome-devtools to operate with the browser.

# Precondition
User runs chromium browser with cdp port enabled.

# Outcomes
- updated workflow.hcl reflecting the use case
- defined contracts for the capability in doc/contracts

# First step
- generate malli schemas for contract

# Next steps
- update workflow.hcl
- write test
- implement capability

# Requirements
- follow CONTRIBUTING.md


