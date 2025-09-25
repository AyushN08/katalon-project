C-2, 16010122243, Ayush Nayak, Devops IA-1

# 🧪 Katalon Project – Demo Automation

This repository contains a **Katalon Studio** project that demonstrates basic browser automation and validation using the Example.com website.

---

## 📂 Project Structure
- **Test Cases/**
  - `TC_OpenExample` → Opens `example.com`, verifies text, extracts heading/paragraph, and takes a screenshot.
- **Object Repository/**
  - Contains locators for elements like heading (`<h1>`) and paragraph (`<p>`).
- **Reports/**
  - Screenshots and test execution logs are stored here after each run.
- **Scripts/**
  - Auto-generated Groovy code for each test case.

---

## 🚀 Features
- Opens [https://example.com](https://example.com) in a browser.
- Verifies heading (`Example Domain`) is present.
- Verifies the paragraph text exists.
- Logs extracted text into the Katalon report.
- Takes a screenshot of the page.
- Closes the browser automatically.

---

## 🛠️ Requirements
- [Katalon Studio](https://katalon.com/) (latest version).
- Git installed locally.
- Java (bundled with Katalon).
- Optional: GitHub Actions for CI/CD integration.

---

## ▶️ Running the Test Locally
1. Clone the repository:
   ```bash
   git clone https://github.com/AyushN08/katalon-project.git
   cd katalon-project
