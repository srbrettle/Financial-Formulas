package srbrettle.financialformulas;

/**
 * A collection of methods for solving Finance/Accounting equations.
 * 
 * @author      Scott Brettle
 */
public class FinancialFormulas
{
    /*
     * -----------------------------------------------------------------------------
     * | Formulas - Activity                                                       |
     * -----------------------------------------------------------------------------
     */

    /**
     * Calculates Asset Turnover from Net Sales and Total Assets.
     * @param netSales Net Sales
     * @param totalAssets Total Assets
     * @return
     */
    public double CalcAssetTurnover(double netSales, double totalAssets)
    {
        return netSales / totalAssets;
    }

    /**
     * Calculates Average Collection Period from Accounts Receivable and Annual Credit Sales.
     * @param accountsReceivable Accounts Receivable
     * @param annualCreditSales Annual Credit Sales
     * @return
     */
    public double CalcAverageCollectionPeriod(double accountsReceivable, double annualCreditSales)
    {
        return accountsReceivable / (annualCreditSales / 365);
    }

    /**
     * Calcualtes Cash Conversion Cycle from Inventory Conversion Period, Receivables Conversion Period and Payables Conversion Period.
     * @param inventoryConversionPeriod Inventory Conversion Period
     * @param receivablesConversionPeriod Receivables Conversion Period
     * @param payablesConversionPeriod Payables Conversion Period
     * @return
     */
    public double CalcCashConversionCycle(double inventoryConversionPeriod, double receivablesConversionPeriod, double payablesConversionPeriod)
    {
        return (inventoryConversionPeriod
                + receivablesConversionPeriod - payablesConversionPeriod);
    }

    /**
     * Calculates Inventory Conversion Period from Inventory Turnover Ratio.
     * @param inventoryTurnoverRatio Inventory Turnover Ratio
     * @return
     */
    public double CalcInventoryConversionPeriod(double inventoryTurnoverRatio)
    {
        return 365 / inventoryTurnoverRatio;
    }

    /**
     * Calculates Inventory Conversion Ratio from Sales and Cost Of Goods Sold.
     * @param sales Sales
     * @param costOfGoodsSold Cost Of Goods Sold
     * @return
     */
    public double CalcInventoryConversionRatio(double sales, double costOfGoodsSold)
    {
        return (sales * 0.5) / costOfGoodsSold;
    }

    /**
     * Calculates Inventory Turnover from Sales and Average Inventory.
     * @param sales Sales
     * @param averageInventory Average Inventory
     * @return
     */
    public double CalcInventoryTurnover(double sales, double averageInventory)
    {
        return sales / averageInventory;
    }

    /**
     * Calculates Payables Conversion Period from Accounts Payable and Purchases.
     * @param accountsPayable Accounts Payable
     * @param purchases Purchases
     * @return
     */
    public double CalcPayablesConversionPeriod(double accountsPayable, double purchases)
    {
        return (accountsPayable / purchases) * 365;
    }

    /**
     * Calculates Receivables Conversion Period from Receivables and Net Sales.
     * @param receivables Receivables
     * @param netSales Net Sales
     * @return
     */
    public double CalcReceivablesConversionPeriod(double receivables, double netSales)
    {
        return (receivables / netSales) * 365;
    }

    /**
     * Calculates Receivables Turnover Ratio from Net Credit Sales and Average Net Receivables.
     * @param netCreditSales Net Credit Sales
     * @param averageNetReceivables Average Net Receivables
     * @return
     */
    public double CalcReceivablesTurnoverRatio(double netCreditSales, double averageNetReceivables)
    {
        return netCreditSales / averageNetReceivables;
    }

    /*
     * -----------------------------------------------------------------------------
     * | Formulas - Basic                                                          |
     * -----------------------------------------------------------------------------
     */

    /**
     * Calculates Assets from Liabilities and Equity.
     * @param liabilities Liabilities
     * @param equity Equity
     * @return
     */
    public double CalcAssets(double liabilities, double equity)
    {
        return liabilities + equity;
    }

    /**
     * Calculates Earnings Before Interest and Taxes (EBIT) from Revenue and Operating Expenses.
     * @param revenue Revenue
     * @param operatingExpenses Operating Expenses
     * @return
     */
    public double CalcEbit(double revenue, double operatingExpenses)
    {
        return revenue - operatingExpenses;
    }

    /**
     * Calculates Equity from Assets and Liabilities.
     * @param assets Assets
     * @param liabilities Liabilities
     * @return
     */
    public double CalcEquity(double assets, double liabilities)
    {
        return assets - liabilities;
    }

    /**
     * Calculates Gross Profit from Revenue and Cost Of Goods Sold (COGS).
     * @param revenue Revenue
     * @param costOfGoodsSold Cost Of Goods Sold
     * @return
     */
    public double CalcGrossProfit(double revenue, double costOfGoodsSold)
    {
        return revenue - costOfGoodsSold;
    }

    /**
     * Calculates Liabilities from Assets and Equity.
     * @param assets Assets
     * @param equity Equity
     * @return
     */
    public double CalcLiabilities(double assets, double equity)
    {
        return assets - equity;
    }

    /**
     * Calculates Net Profit from Gross Profit, Operating Expenses, Taxes and Interest.
     * @param grossProfit Gross Profit
     * @param operatingExpenses Operating Expenses
     * @param taxes Taxes
     * @param interest Interest
     * @return
     */
    public double CalcNetProfit(double grossProfit, double operatingExpenses, double taxes, double interest)
    {
        return grossProfit - operatingExpenses - taxes - interest;
    }

    /**
     * Calculates Operation Profit from Gross Profit and Operating Expenses.
     * @param grossProfit Gross Profit
     * @param operatingExpenses Operating Expenses
     * @return
     */
    public double CalcOperatingProfit(double grossProfit, double operatingExpenses)
    {
        return grossProfit - operatingExpenses;
    }

    /**
     * Calculates Sales Revenue from Gross Sales and Sales of Returns and Allowances.
     * @param grossSales Gross Sales
     * @param salesOfReturnsAndAllowances Sales of Returns and Allowances
     * @return
     */
    public double CalcSalesRevenue(double grossSales, double salesOfReturnsAndAllowances)
    {
        return grossSales - salesOfReturnsAndAllowances;
    }

    /*
     * -----------------------------------------------------------------------------
     * | Formulas - Debt                                                           |
     * -----------------------------------------------------------------------------
     */

    /**
     * Calculates Debt to Equity Ratio from Total Liabilities and Shareholder Equity.
     * @param totalLiabilities Total Liabilities
     * @param shareholderEquity Shareholder Equity
     * @return
     */
    public double CalcDebtEquityRatio(double totalLiabilities, double shareholderEquity)
    {
        return totalLiabilities / shareholderEquity;
    }

    /**
     * Calculates Debt Ratio Total Liabilities and Total Assets.
     * @param totalLiabilities Total Liabilities
     * @param totalAssets Total Assets
     * @return
     */
    public double CalcDebtRatio(double totalLiabilities, double totalAssets)
    {
        return totalLiabilities / totalAssets;
    }

    /**
     * Calculates Debt-Service Coverage Ratio Net Operating Income and Total Debt Service.
     * @param netOperatingIncome Net Operating Income
     * @param totalDebtService Total Debt Service
     * @return
     */
    public double CalcDebtServiceCoverageRatio(double netOperatingIncome, double totalDebtService)
    {
        return netOperatingIncome / totalDebtService;
    }

    /**
     * Calculates Long-Term Debt to Equity Ratio from Long-Term Liabilities and Equity.
     * @param longTermLiabilities Long-Term Liabilities
     * @param equity Equity
     * @return
     */
    public double CalcLongTermDebtEquityRatio(double longTermLiabilities, double equity)
    {
        return longTermLiabilities / equity;
    }

    /*
     * -----------------------------------------------------------------------------
     * | Formulas - Depreciation                                                   |
     * -----------------------------------------------------------------------------
     */

    /**
     * Calculates Book Value from Acquisition Cost and Depreciation.
     * @param acquisitionCost Acquisition Cost
     * @param depreciation Depreciation
     * @return
     */
    public double CalcBookValue(double acquisitionCost, double depreciation)
    {
        return acquisitionCost - depreciation;
    }

    /**
     * Calculates Decling Balance from Depreciation Rate and Book Value at Beginning of Year.
     * @param depreciationRate Depreciation Rate
     * @param bookValueAtBeginningOfYear Book Value at Beginning of Year
     * @return
     */
    public double CalcDecliningBalance(double depreciationRate, double bookValueAtBeginningOfYear)
    {
        return depreciationRate * bookValueAtBeginningOfYear;
    }

    /**
     * Calculates Units Of Production from Cost of Asset, Residual Value, Estimated Total Production and Actual Production.
     * @param costOfAsset Cost of Asset
     * @param residualValue Residual Value
     * @param estimatedTotalProduction Estimated Total Production
     * @param actualProduction Actual Production
     * @return
     */
    public double CalcUnitsOfProduction(double costOfAsset, double residualValue, double estimatedTotalProduction, double actualProduction)
    {
        return ((costOfAsset - residualValue) / estimatedTotalProduction) * actualProduction;
    }

    /**
     * Calculates Straight Line Method from Cost of Fixed Asset, Residual Value and Useful Life of Asset.
     * @param costOfFixedAsset Cost of Fixed Asset
     * @param residualValue Residual Value
     * @param usefulLifeOfAsset Useful Life of Asset
     * @return
     */
    public double CalcStraightLineMethod(double costOfFixedAsset, double residualValue, double usefulLifeOfAsset)
    {
        return (costOfFixedAsset - residualValue) / usefulLifeOfAsset;
    }

    /*
     * -----------------------------------------------------------------------------
     * | Formulas - Liquidity                                                      |
     * -----------------------------------------------------------------------------
     */

    /**
     * Calculates Cash Ration from Cash, Marketable Securities and Current Liabilities.
     * @param cash Cash
     * @param marketableSecurities Marketable Securities
     * @param currentLiabilities Current Liabilities
     * @return
     */
    public double CalcCashRatio(double cash, double marketableSecurities, double currentLiabilities)
    {
        return (cash + marketableSecurities) / currentLiabilities;
    }

    /**
     * Calculates Current Ratio from Current Assets and Current Liabilties.
     * @param currentAssets Current Assets
     * @param currentLiabilities Current Liabilities
     * @return
     */
    public double CalcCurrentRatio(double currentAssets, double currentLiabilities)
    {
        return currentAssets / currentLiabilities;
    }

    /**
     * Calculates Operating Cash Flow Ratio from Operating Cash Flow and Total Debts.
     * @param operatingCashFlow Operating Cash Flow
     * @param totalDebts Total Debts
     * @return
     */
    public double CalcOperatingCashFlowRatio(double operatingCashFlow, double totalDebts)
    {
        return operatingCashFlow / totalDebts;
    }

    /**
     * Calculates Quick Ratio from Current Assets, Inventories and Current Liabilities.
     * @param currentAssets Current Assets
     * @param inventories Inventories
     * @param currentLiabilities Current Liabilities
     * @return
     */
    public double CalcQuickRatio(double currentAssets, double inventories, double currentLiabilities)
    {
        return (currentAssets - inventories) / currentLiabilities;
    }


    /*
     * -----------------------------------------------------------------------------
     * | Formulas - Market                                                          |
     * -----------------------------------------------------------------------------
     */

    /**
     * Calculates Dividend Cover from Earnings Per Share and Dividends Per Share.
     * @param earningsPerShare Earnings Per Share
     * @param dividendsPerShare Devidends Per Share
     * @return
     */
    public double CalcDividendCover(double earningsPerShare, double dividendsPerShare)
    {
        return earningsPerShare / dividendsPerShare;
    }

    /**
     * Calculates Dividends Per Share (DPS) from Dividends Paid and Number Of Shares.
     * @param dividendsPaid Dividends Paid
     * @param numberOfShares Number of Shares
     * @return
     */
    public double CalcDividendsPerShare(double dividendsPaid, double numberOfShares)
    {
        return dividendsPaid / numberOfShares;
    }

    /**
     * Calculates Dividend Yield from Annual Dividend Per Share and Price Per Share.
     * @param annualDividendPerShare Annual Dividend Per Share
     * @param pricePerShare Price Per Share
     * @return
     */
    public double CalcDividendYield(double annualDividendPerShare, double pricePerShare)
    {
        return annualDividendPerShare / pricePerShare;
    }

    /**
     * Calculates Earnings Per Share from Net Earnings and Number of Shares.
     * @param netEarnings Net Earnings
     * @param numberOfShares Number of Shares
     * @return
     */
    public double CalcEarningsPerShare(double netEarnings, double numberOfShares)
    {
        return netEarnings / numberOfShares;
    }

    /**
     * Calculates Payout Ratio from Dividends and Earnings.
     * @param dividends Dividends
     * @param earnings Earnings
     * @return
     */
    public double CalcPayoutRatio(double dividends, double earnings)
    {
        return dividends / earnings;
    }

    /**
     * Calculates Price/Earnings to Growth (PEG) Ratio from Price Per Earnings and Annual EPS Growth.
     * @param pricePerEarnings Price Per Earnings
     * @param annualEpsGrowth Annual EPS Growth
     * @return
     */
    public double CalcPegRatio(double pricePerEarnings, double annualEpsGrowth)
    {
        return pricePerEarnings / annualEpsGrowth;
    }

    /**
     * Calculates Price to Sales Ratio from Price Per Share and Revenue Per Share.
     * @param pricePerShare Price Per Share
     * @param revenuePerShare Revenue Per Share
     * @return
     */
    public double CalcPriceSalesRatio(double pricePerShare, double revenuePerShare)
    {
        return pricePerShare / revenuePerShare;
    }

    /*
     * -----------------------------------------------------------------------------
     * | Formulas - Profitability                                                  |
     * -----------------------------------------------------------------------------
     */

    /**
     * Calculates Efficiency Ratio from Non-Interest Expense and Revenue.
     * @param nonInterestExpense Non-Interest Expense
     * @param revenue Revenue
     * @return
     */
    public double CalcEfficiencyRatio(double nonInterestExpense, double revenue)
    {
        return nonInterestExpense / revenue;
    }

    /**
     * Calculates Gross Profit Margin from Gross Profit and Revenue.
     * @param grossProfit Gross Profit
     * @param revenue Revenue
     * @return
     */
    public double CalcGrossProfitMargin(double grossProfit, double revenue)
    {
        return grossProfit / revenue;
    }

    /**
     * Calculates Operating Margin from Operating Income and Revenue.
     * @param operatingIncome Operating Income
     * @param revenue Revenue
     * @return
     */
    public double CalcOperatingMargin(double operatingIncome, double revenue)
    {
        return operatingIncome / revenue;
    }

    /**
     * Calculates Profit Margin from Net Profit and Revenue.
     * @param netProfit Net Profit
     * @param revenue Revenue
     * @return
     */
    public double CalcProfitMargin(double netProfit, double revenue)
    {
        return netProfit / revenue;
    }

    /**
     * Calculates Return On Assets (ROA) from Net Income and Total Assets.
     * @param netIncome Net Income
     * @param totalAssets Total Assets
     * @return
     */
    public double CalcReturnOnAssets(double netIncome, double totalAssets)
    {
        return netIncome / totalAssets;
    }

    /**
     * Calculates Return On Capital (ROC) from EBIT, Tax Rate and Invested Capital.
     * @param ebit Earnings Before Interest and Taxes
     * @param taxRate Tax Rate
     * @param investedCapital Invested Capital
     * @return
     */
    public double CalcReturnOnCapital(double ebit, double taxRate, double investedCapital)
    {
        return ebit * (1 - taxRate) / investedCapital;
    }

    /**
     * Calculates Return on Equity (ROE) from Net Income and Average Shareholder Equity.
     * @param netIncome Net Income
     * @param averageShareholderEquity Average Shareholder Equity
     * @return
     */
    public double CalcReturnOnEquity(double netIncome, double averageShareholderEquity)
    {
        return netIncome / averageShareholderEquity;
    }

    /**
     * Calculates Return On Net Assets (RONA) from Net Income, Fixed Assets and Working Capital.
     * @param netIncome Net Income
     * @param fixedAssets Fixed Assets
     * @param workingCapital Working Capital
     * @return
     */
    public double CalcReturnOnNetAssets(double netIncome, double fixedAssets, double workingCapital)
    {
        return netIncome / (fixedAssets + workingCapital);
    }

    /**
     * Calculates Risk-Adjusted Return On Capital (RAROC) from Expected Return and Economic Capital.
     * @param expectedReturn Expected Return
     * @param economicCapital Economic Capital
     * @return
     */
    public double CalcRiskAdjustedReturnOnCapital(double expectedReturn, double economicCapital)
    {
        return expectedReturn / economicCapital;
    }

    /**
     * Calculates Return on Investment (ROI) from Gain and Cost.
     * @param gain Gain
     * @param cost Cost
     * @return
     */
    public double CalcReturnOnInvestment(double gain, double cost)
    {
        return (gain - cost) / cost;
    }

    /**
     * Calculates Earnings Before Interest, Taxes, Depreciation and Amortization (EBITDA) from EBIT, Depreciation and Amortization.
     * @param ebit Earnings Before Interest and Taxes
     * @param depreciation Depreciation
     * @param amortization Amortization
     * @return
     */
    public double CalcEbitda(double ebit, double depreciation, double amortization)
    {
        return ebit + depreciation + amortization;
    }
}
