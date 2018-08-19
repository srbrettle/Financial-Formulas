// FinancialFormulas.cpp
// compile with: cl /c /EHsc FinancialFormulas.cpp
// post-build command: lib FinancialFormulas.obj

#include "FinancialFormulas.h"

#include <stdexcept>

using namespace std;

namespace FinancialFormulas
{

	/*
	* -----------------------------------------------------------------------------
	* | Formulas - Activity                                                       |
	* -----------------------------------------------------------------------------
	*/

	/// Calculates Asset Turnover from Net Sales and Total Assets
	double CalcAssetTurnover(double netSales, double totalAssets)
	{
		return netSales / totalAssets;
	}

	/// Calculates Average Collection Period from Accounts Receivable and Annual Credit Sales
	double CalcAverageCollectionPeriod(double accountsReceivable, double annualCreditSales)
	{
		return accountsReceivable / (annualCreditSales / 365);
	}

	/// Calcualtes Cash Conversion Cycle from Inventory Conversion Period, Receivables Conversion Period and Payables Conversion Period
	double CalcCashConversionCycle(double inventoryConversionPeriod, double receivablesConversionPeriod, double payablesConversionPeriod)
	{
		return (inventoryConversionPeriod
			+ receivablesConversionPeriod - payablesConversionPeriod);
	}

	/// Calculates Inventory Conversion Period from Inventory Turnover Ratio
	double CalcInventoryConversionPeriod(double inventoryTurnoverRatio)
	{
		return 365 / inventoryTurnoverRatio;
	}

	/// Calculates Inventory Conversion Ratio from Sales and Cost Of Goods Sold
	double CalcInventoryConversionRatio(double sales, double costOfGoodsSold)
	{
		return (sales * 0.5) / costOfGoodsSold;
	}

	/// Calculates Inventory Turnover from Sales and Average Inventory
	double CalcInventoryTurnover(double sales, double averageInventory)
	{
		return sales / averageInventory;
	}

	/// Calculates Payables Conversion Period from Accounts Payable and Purchases
	double CalcPayablesConversionPeriod(double accountsPayable, double purchases)
	{
		return (accountsPayable / purchases) * 365;
	}

	/// Calculates Receivables Conversion Period from Receivables and Net Sales
	double CalcReceivablesConversionPeriod(double receivables, double netSales)
	{
		return (receivables / netSales) * 365;
	}

	/// Calculates Receivables Turnover Ratio from Net Credit Sales and Average Net Receivables
	double CalcReceivablesTurnoverRatio(double netCreditSales, double averageNetReceivables)
	{
		return netCreditSales / averageNetReceivables;
	}

	/*
	* -----------------------------------------------------------------------------
	* | Formulas - Basic                                                          |
	* -----------------------------------------------------------------------------
	*/

	/// Calculates Assets from Liabilities and Equity
	double CalcAssets(double liabilities, double equity)
	{
		return liabilities + equity;
	}

	/// Calculates Earnings Before Interest and Taxes (EBIT) from Revenue and Operating Expenses
	double CalcEbit(double revenue, double operatingExpenses)
	{
		return revenue - operatingExpenses;
	}

	/// Calculates Equity from Assets and Liabilities
	double CalcEquity(double assets, double liabilities)
	{
		return assets - liabilities;
	}

	/// Calculates Gross Profit from Revenue and Cost Of Goods Sold (COGS)
	double CalcGrossProfit(double revenue, double costOfGoodsSold)
	{
		return revenue - costOfGoodsSold;
	}

	/// Calculates Liabilities from Assets and Equity
	double CalcLiabilities(double assets, double equity)
	{
		return assets - equity;
	}

	/// Calculates Net Profit from Gross Profit, Operating Expenses, Taxes and Interest
	double CalcNetProfit(double grossProfit, double operatingExpenses, double taxes, double interest)
	{
		return grossProfit - operatingExpenses - taxes - interest;
	}

	/// Calculates Operation Profit from Gross Profit and Operating Expenses
	double CalcOperatingProfit(double grossProfit, double operatingExpenses)
	{
		return grossProfit - operatingExpenses;
	}

	/// Calculates Sales Revenue from Gross Sales and Sales of Returns and Allowances
	double CalcSalesRevenue(double grossSales, double salesOfReturnsAndAllowances)
	{
		return grossSales - salesOfReturnsAndAllowances;
	}

	/*
	* -----------------------------------------------------------------------------
	* | Formulas - Debt                                                           |
	* -----------------------------------------------------------------------------
	*/

	/// Calculates Debt to Equity Ratio from Total Liabilities and Shareholder Equity
	double CalcDebtEquityRatio(double totalLiabilities, double shareholderEquity)
	{
		return totalLiabilities / shareholderEquity;
	}

	/// Calculates Debt Ratio Total Liabilities and Total Assets
	double CalcDebtRatio(double totalLiabilities, double totalAssets)
	{
		return totalLiabilities / totalAssets;
	}

	/// Calculates Debt-Service Coverage Ratio Net Operating Income and Total Debt Service
	double CalcDebtServiceCoverageRatio(double netOperatingIncome, double totalDebtService)
	{
		return netOperatingIncome / totalDebtService;
	}

	/// Calculates Long-Term Debt to Equity Ratio from Long-Term Liabilities and Equity
	double CalcLongTermDebtEquityRatio(double longTermLiabilities, double equity)
	{
		return longTermLiabilities / equity;
	}

	/*
	* -----------------------------------------------------------------------------
	* | Formulas - Depreciation                                                   |
	* -----------------------------------------------------------------------------
	*/

	/// Calculates Book Value from Acquisition Cost and Depreciation
	double CalcBookValue(double acquisitionCost, double depreciation)
	{
		return acquisitionCost - depreciation;
	}

	/// Calculates Decling Balance from Depreciation Rate and Book Value at Beginning of Year
	double CalcDecliningBalance(double depreciationRate, double bookValueAtBeginningOfYear)
	{
		return depreciationRate * bookValueAtBeginningOfYear;
	}

	/// Calculates Units Of Production from Cost of Asset, Residual Value, Estimated Total Production and Actual Production
	double CalcUnitsOfProduction(double costOfAsset, double residualValue, double estimatedTotalProduction, double actualProduction)
	{
		return ((costOfAsset - residualValue) / estimatedTotalProduction) * actualProduction;
	}

	/// Calculates Straight Line Method from Cost of Fixed Asset, Residual Value and Useful Life of Asset
	double CalcStraightLineMethod(double costOfFixedAsset, double residualValue, double usefulLifeOfAsset)
	{
		return (costOfFixedAsset - residualValue) / usefulLifeOfAsset;
	}

	/*
	* -----------------------------------------------------------------------------
	* | Formulas - Liquidity                                                      |
	* -----------------------------------------------------------------------------
	*/

	/// Calculates Cash Ration from Cash, Marketable Securities and Current Liabilities
	double CalcCashRatio(double cash, double marketableSecurities, double currentLiabilities)
	{
		return (cash + marketableSecurities) / currentLiabilities;
	}

	/// Calculates Current Ratio from Current Assets and Current Liabilties
	double CalcCurrentRatio(double currentAssets, double currentLiabilities)
	{
		return currentAssets / currentLiabilities;
	}

	/// Calculates Operating Cash Flow Ratio from Operating Cash Flow and Total Debts
	double CalcOperatingCashFlowRatio(double operatingCashFlow, double totalDebts)
	{
		return operatingCashFlow / totalDebts;
	}

	/// Calculates Quick Ratio from Current Assets, Inventories and Current Liabilities
	double CalcQuickRatio(double currentAssets, double inventories, double currentLiabilities)
	{
		return (currentAssets - inventories) / currentLiabilities;
	}

	/*
	* -----------------------------------------------------------------------------
	* | Formulas - Market                                                          |
	* -----------------------------------------------------------------------------
	*/

	/// Calculates Dividend Cover from Earnings Per Share and Dividends Per Share
	double CalcDividendCover(double earningsPerShare, double dividendsPerShare)
	{
		return earningsPerShare / dividendsPerShare;
	}

	/// Calculates Dividends Per Share (DPS) from Dividends Paid and Number Of Shares
	double CalcDividendsPerShare(double dividendsPaid, double numberOfShares)
	{
		return dividendsPaid / numberOfShares;
	}

	/// Calculates Dividend Yield from Annual Dividend Per Share and Price Per Share
	double CalcDividendYield(double annualDividendPerShare, double pricePerShare)
	{
		return annualDividendPerShare / pricePerShare;
	}

	/// Calculates Earnings Per Share from Net Earnings and Number of Shares
	double CalcEarningsPerShare(double netEarnings, double numberOfShares)
	{
		return netEarnings / numberOfShares;
	}

	/// Calculates Payout Ratio from Dividends and Earnings
	double CalcPayoutRatio(double dividends, double earnings)
	{
		return dividends / earnings;
	}

	/// Calculates Price/Earnings to Growth (PEG) Ratio from Price Per Earnings and Annual EPS Growth
	double CalcPegRatio(double pricePerEarnings, double annualEpsGrowth)
	{
		return pricePerEarnings / annualEpsGrowth;
	}

	/// Calculates Price to Sales Ratio from Price Per Share and Revenue Per Share
	double CalcPriceSalesRatio(double pricePerShare, double revenuePerShare)
	{
		return pricePerShare / revenuePerShare;
	}

	/*
	* -----------------------------------------------------------------------------
	* | Formulas - Profitability                                                  |
	* -----------------------------------------------------------------------------
	*/

	/// Calculates Efficiency Ratio from Non-Interest Expense and Revenue
	double CalcEfficiencyRatio(double nonInterestExpense, double revenue)
	{
		return nonInterestExpense / revenue;
	}

	/// Calculates Gross Profit Margin from Gross Profit and Revenue
	double CalcGrossProfitMargin(double grossProfit, double revenue)
	{
		return grossProfit / revenue;
	}

	/// Calculates Operating Margin from Operating Income and Revenue
	double CalcOperatingMargin(double operatingIncome, double revenue)
	{
		return operatingIncome / revenue;
	}

	/// Calculates Profit Margin from Net Profit and Revenue
	double CalcProfitMargin(double netProfit, double revenue)
	{
		return netProfit / revenue;
	}

	/// Calculates Return On Assets (ROA) from Net Income and Total Assets
	double CalcReturnOnAssets(double netIncome, double totalAssets)
	{
		return netIncome / totalAssets;
	}

	/// Calculates Return On Capital (ROC) from EBIT, Tax Rate and Invested Capital
	double CalcReturnOnCapital(double ebit, double taxRate, double investedCapital)
	{
		return ebit * (1 - taxRate) / investedCapital;
	}

	/// Calculates Return on Equity (ROE) from Net Income and Average Shareholder Equity
	double CalcReturnOnEquity(double netIncome, double averageShareholderEquity)
	{
		return netIncome / averageShareholderEquity;
	}

	/// Calculates Return On Net Assets (RONA) from Net Income, Fixed Assets and Working Capital
	double CalcReturnOnNetAssets(double netIncome, double fixedAssets, double workingCapital)
	{
		return netIncome / (fixedAssets + workingCapital);
	}

	/// Calculates Risk-Adjusted Return On Capital (RAROC) from Expected Return and Economic Capital
	double CalcRiskAdjustedReturnOnCapital(double expectedReturn, double economicCapital)
	{
		return expectedReturn / economicCapital;
	}

	/// Calculates Return on Investment (ROI) from Gain and Cost
	double CalcReturnOnInvestment(double gain, double cost)
	{
		return (gain - cost) / cost;
	}

	/// Calculates Earnings Before Interest, Taxes, Depreciation and Amortization (EBITDA) from EBIT, Depreciation and Amortization
	double CalcEbitda(double ebit, double depreciation, double amortization)
	{
		return ebit + depreciation + amortization;
	}
}
