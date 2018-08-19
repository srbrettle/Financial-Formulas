// FinancialFormulas.h

#pragma once

namespace FinancialFormulas
{
	class FinancialFormulas
	{
	public:
		/*
		* -----------------------------------------------------------------------------
		* | Formulas - Activity                                                       |
		* -----------------------------------------------------------------------------
		*/

		// Calculates Asset Turnover from Net Sales and Total Assets
		static double CalcAssetTurnover(static double netSales, static double totalAssets);

		// Calculates Average Collection Period from Accounts Receivable and Annual Credit Sales
		static double CalcAverageCollectionPeriod(static double accountsReceivable, static double annualCreditSales);

		// Calcualtes Cash Conversion Cycle from Inventory Conversion Period, Receivables Conversion Period and Payables Conversion Period
		static double CalcCashConversionCycle(static double inventoryConversionPeriod, static double receivablesConversionPeriod, static double payablesConversionPeriod);

		// Calculates Inventory Conversion Period from Inventory Turnover Ratio
		static double CalcInventoryConversionPeriod(static double inventoryTurnoverRatio);

		// Calculates Inventory Conversion Ratio from Sales and Cost Of Goods Sold
		static double CalcInventoryConversionRatio(static double sales, static double costOfGoodsSold);

		// Calculates Inventory Turnover from Sales and Average Inventory
		static double CalcInventoryTurnover(static double sales, static double averageInventory);

		// Calculates Payables Conversion Period from Accounts Payable and Purchases
		static double CalcPayablesConversionPeriod(static double accountsPayable, static double purchases);

		// Calculates Receivables Conversion Period from Receivables and Net Sales
		static double CalcReceivablesConversionPeriod(static double receivables, static double netSales);

		// Calculates Receivables Turnover Ratio from Net Credit Sales and Average Net Receivables
		static double CalcReceivablesTurnoverRatio(static double netCreditSales, static double averageNetReceivables);

		/*
		* -----------------------------------------------------------------------------
		* | Formulas - Basic                                                          |
		* -----------------------------------------------------------------------------
		*/

		// Calculates Assets from Liabilities and Equity
		static double CalcAssets(static double liabilities, static double equity);

		// Calculates Earnings Before Interest and Taxes (EBIT) from Revenue and Operating Expenses
		static double CalcEbit(static double revenue, static double operatingExpenses);

		// Calculates Equity from Assets and Liabilities
		static double CalcEquity(static double assets, static double liabilities);

		// Calculates Gross Profit from Revenue and Cost Of Goods Sold (COGS);
		static double CalcGrossProfit(static double revenue, static double costOfGoodsSold);

		// Calculates Liabilities from Assets and Equity
		static double CalcLiabilities(static double assets, static double equity);

		// Calculates Net Profit from Gross Profit, Operating Expenses, Taxes and Interest
		static double CalcNetProfit(static double grossProfit, static double operatingExpenses, static double taxes, static double interest);

		// Calculates Operation Profit from Gross Profit and Operating Expenses
		static double CalcOperatingProfit(static double grossProfit, static double operatingExpenses);

		// Calculates Sales Revenue from Gross Sales and Sales of Returns and Allowances
		static double CalcSalesRevenue(static double grossSales, static double salesOfReturnsAndAllowances);

		/*
		* -----------------------------------------------------------------------------
		* | Formulas - Debt                                                           |
		* -----------------------------------------------------------------------------
		*/

		// Calculates Debt to Equity Ratio from Total Liabilities and Shareholder Equity
		static double CalcDebtEquityRatio(static double totalLiabilities, static double shareholderEquity);

		// Calculates Debt Ratio Total Liabilities and Total Assets
		static double CalcDebtRatio(static double totalLiabilities, static double totalAssets);

		// Calculates Debt-Service Coverage Ratio Net Operating Income and Total Debt Service
		static double CalcDebtServiceCoverageRatio(static double netOperatingIncome, static double totalDebtService);

		// Calculates Long-Term Debt to Equity Ratio from Long-Term Liabilities and Equity
		static double CalcLongTermDebtEquityRatio(static double longTermLiabilities, static double equity);

		/*
		* -----------------------------------------------------------------------------
		* | Formulas - Depreciation                                                   |
		* -----------------------------------------------------------------------------
		*/

		// Calculates Book Value from Acquisition Cost and Depreciation
		static double CalcBookValue(static double acquisitionCost, static double depreciation);

		// Calculates Decling Balance from Depreciation Rate and Book Value at Beginning of Year
		static double CalcDecliningBalance(static double depreciationRate, static double bookValueAtBeginningOfYear);

		// Calculates Units Of Production from Cost of Asset, Residual Value, Estimated Total Production and Actual Production
		static double CalcUnitsOfProduction(static double costOfAsset, static double residualValue, static double estimatedTotalProduction, static double actualProduction);

		// Calculates Straight Line Method from Cost of Fixed Asset, Residual Value and Useful Life of Asset
		static double CalcStraightLineMethod(static double costOfFixedAsset, static double residualValue, static double usefulLifeOfAsset);

		/*
		* -----------------------------------------------------------------------------
		* | Formulas - Liquidity                                                      |
		* -----------------------------------------------------------------------------
		*/

		// Calculates Cash Ration from Cash, Marketable Securities and Current Liabilities
		static double CalcCashRatio(static double cash, static double marketableSecurities, static double currentLiabilities);

		// Calculates Current Ratio from Current Assets and Current Liabilties
		static double CalcCurrentRatio(static double currentAssets, static double currentLiabilities);

		// Calculates Operating Cash Flow Ratio from Operating Cash Flow and Total Debts
		static double CalcOperatingCashFlowRatio(static double operatingCashFlow, static double totalDebts);

		// Calculates Quick Ratio from Current Assets, Inventories and Current Liabilities
		static double CalcQuickRatio(static double currentAssets, static double inventories, static double currentLiabilities);

		/*
		* -----------------------------------------------------------------------------
		* | Formulas - Market                                                          |
		* -----------------------------------------------------------------------------
		*/

		// Calculates Dividend Cover from Earnings Per Share and Dividends Per Share
		static double CalcDividendCover(static double earningsPerShare, static double dividendsPerShare);

		// Calculates Dividends Per Share (DPS) from Dividends Paid and Number Of Shares
		static double CalcDividendsPerShare(static double dividendsPaid, static double numberOfShares);

		// Calculates Dividend Yield from Annual Dividend Per Share and Price Per Share
		static double CalcDividendYield(static double annualDividendPerShare, static double pricePerShare);

		// Calculates Earnings Per Share from Net Earnings and Number of Shares
		static double CalcEarningsPerShare(static double netEarnings, static double numberOfShares);

		// Calculates Payout Ratio from Dividends and Earnings
		static double CalcPayoutRatio(static double dividends, static double earnings);

		// Calculates Price/Earnings to Growth (PEG) Ratio from Price Per Earnings and Annual EPS Growth
		static double CalcPegRatio(static double pricePerEarnings, static double annualEpsGrowth);

		// Calculates Price to Sales Ratio from Price Per Share and Revenue Per Share
		static double CalcPriceSalesRatio(static double pricePerShare, static double revenuePerShare);

		/*
		* -----------------------------------------------------------------------------
		* | Formulas - Profitability                                                  |
		* -----------------------------------------------------------------------------
		*/

		// Calculates Efficiency Ratio from Non-Interest Expense and Revenue
		static double CalcEfficiencyRatio(static double nonInterestExpense, static double revenue);

		// Calculates Gross Profit Margin from Gross Profit and Revenue
		static double CalcGrossProfitMargin(static double grossProfit, static double revenue);

		// Calculates Operating Margin from Operating Income and Revenue
		static double CalcOperatingMargin(static double operatingIncome, static double revenue);

		// Calculates Profit Margin from Net Profit and Revenue
		static double CalcProfitMargin(static double netProfit, static double revenue);

		// Calculates Return On Assets (ROA) from Net Income and Total Assets
		static double CalcReturnOnAssets(static double netIncome, static double totalAssets);

		// Calculates Return On Capital (ROC) from EBIT, Tax Rate and Invested Capital
		static double CalcReturnOnCapital(static double ebit, static double taxRate, static double investedCapital);

		// Calculates Return on Equity (ROE) from Net Income and Average Shareholder Equity
		static double CalcReturnOnEquity(static double netIncome, static double averageShareholderEquity);

		// Calculates Return On Net Assets (RONA) from Net Income, Fixed Assets and Working Capital
		static double CalcReturnOnNetAssets(static double netIncome, static double fixedAssets, static double workingCapital);

		// Calculates Risk-Adjusted Return On Capital (RAROC) from Expected Return and Economic Capital
		static double CalcRiskAdjustedReturnOnCapital(static double expectedReturn, static double economicCapital);

		// Calculates Return on Investment (ROI) from Gain and Cost
		static double CalcReturnOnInvestment(static double gain, static double cost);

		// Calculates Earnings Before Interest, Taxes, Depreciation and Amortization (EBITDA) from EBIT, Depreciation and Amortization
		static double CalcEbitda(static double ebit, static double depreciation, static double amortization);
	};
}
