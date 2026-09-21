# Household Water-Usage and Billing Monitor

A simple Java program that records daily water usage, calculates the total and
average, and works out the bill using slab-based rates. It also alerts the user
when a day's usage is unusually high, which may indicate a leak.

## Features
- Records water usage (in litres) for each day
- Calculates total usage and daily average
- Slab-based billing: first 10 kL at Rs 8, next 10 kL at Rs 12, above 20 kL at Rs 20, plus a Rs 50 service charge
- High-usage alert when a day's usage is above 600 litres

## How to run
    javac WaterBilling.java
    java WaterBilling

## Files
- `WaterBilling.java`: the program
- `WATER USAGE.docx`: project abstract and report
