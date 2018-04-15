# Financial-Formulas [![Build Status](https://travis-ci.org/srbrettle/Financial-Formulas.svg?branch=master)](https://travis-ci.org/srbrettle/Financial-Formulas) [![contributions welcome](https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=flat)](https://github.com/srbrettle/Financial-Formulas/issues)

A collection of methods for solving Finance/Accounting equations.

## Getting Started - Java

1. Download and import [this](/main/java/) library into your project:
```java
import srbrettle.financialformulas.FinancialFormulas;
```
2. Create an instance of the class: 
```java
FinancialFormulas calc = new FinancialFormulas();
```
3. Use the library methods:
```java
double result = calc.CalcPriceSalesRatio(500,200);
```

## Getting Started - C#

### Using NuGet [![NuGet](https://img.shields.io/badge/NuGet-1.0.1.1-blue.svg)](https://www.nuget.org/packages/FinancialFormulas/1.0.1.1)

1. Within your project, install FinancialFormulas NuGet package (via "Manage Packages for Solution" or running the following in "Packet Manager Console".
```PowerShell
Install-Package FinancialFormulas -Version 1.0.1.1
```
2. Create an instance of the class: 
```c#
var calc = new FinancialFormulas.FinancialFormulas();
```
3. Use the library methods:
```c#
double result = calc.CalcPriceSalesRatio(500,200);
```

### Manually

1. Download and import [this](/main/csharp/) library into your project:
```c#
using srbrettle.financialformulas.FinancialFormulas;
```
2. Create an instance of the class: 
```c#
var calc = new FinancialFormulas();
```
3. Use the library methods:
```c#
double result = calc.CalcPriceSalesRatio(500,200);
```

## Getting Started - Python

Note that the mothod and variable names have been changed to meet PEP 8 guidelines.

1. Download and import [this](/main/python/) library into your project:
```python
import srbrettle.financialformulas.FinancialFormulas as calc
```
2. Use the library methods:
```python
assets = calc.calc_price_sales_ratio(500, 200)
```


## License

This project is licensed under the MIT License - see the [LICENSE](/LICENSE) file for details.

## Formulas / Equations included

* Asset Turnover
* Assets
* Average Collection Period
* Book Value
* Cash Conversion Cycle
* Cash Ratio
* Current Ratio
* Debt Equity Ratio
* Debt Ratio
* Debt Service Coverage Ratio
* Declining Balance
* Dividend Cover
* Dividend Yield
* Dividends Per Share
* Earnings Per Share
* EBIT
* EBITDA
* Efficiency Ratio
* Equity
* Gross Profit
* Gross Profit Margin
* Inventory Conversion Period
* Inventory Conversion Ratio
* Inventory Turnover
* Long-Term Debt Equity Ratio
* Liabilities
* Net Profit
* Operating Cash Flow Ratio
* Operating Margin
* Operating Profit
* Payables Conversion Period
* Payout Ratio
* PEG Ratio
* Price Sales Ratio
* Profit Margin
* Quick Ratio
* Receivables Conversion Period
* Receivables Turnover Ratio
* Return On Assets
* Return On Capital
* Return On Equity
* Return On Investment
* Return On Net Assets
* Risk Adjusted Return On Capital
* Sales Revenue
* Straight Line Method
* Units Of Production
