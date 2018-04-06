namespace FinancialFormulas
{
    public class FinancialFormulas
    {

        // Activity
        public double CalcAssetTurnover(double netSales, double totalAssets)
        {
            return netSales / totalAssets;
        }

        public double CalcAverageCollectionPeriod(double accountsReceivable, double annualCreditSales)
        {
            return accountsReceivable / (annualCreditSales / 365);
        }

        public double CalcCashConversionCycle(double inventoryConversionPeriod, double receivablesConversionPeriod, double payablesConversionPeriod)
        {
            return (inventoryConversionPeriod
                    + receivablesConversionPeriod - payablesConversionPeriod);
        }

        public double CalcInventoryConversionPeriod(double inventoryTurnoverRatio)
        {
            return 365 / inventoryTurnoverRatio;
        }

        public double CalcInventoryConversionRatio(double sales, double costOfGoodsSold)
        {
            return (sales * 0.5) / costOfGoodsSold;
        }

        public double CalcInventoryTurnover(double sales, double averageInventory)
        {
            return sales / averageInventory;
        }

        public double CalcPayablesConversionPeriod(double accountsPayable, double purchases)
        {
            return (accountsPayable / purchases) * 365;
        }

        public double CalcReceivablesConversionPeriod(double receivables, double netSales)
        {
            return (receivables / netSales) * 365;
        }

        public double CalcReceivablesTurnoverRatio(double netCreditSales, double averageNetReceivables)
        {
            return netCreditSales / averageNetReceivables;
        }

        // Basic
        public double CalcAssets(double liabilities, double equity)
        {
            return liabilities + equity;
        }

        public double CalcEbit(double revenue, double operatingExpenses)
        {
            return revenue - operatingExpenses;
        }

        public double CalcEquity(double assets, double liabilities)
        {
            return assets - liabilities;
        }

        public double CalcGrossProfit(double revenue, double costOfGoodsSold)
        {
            return revenue - costOfGoodsSold;
        }

        public double CalcLiabilities(double assets, double equity)
        {
            return assets - equity;
        }

        public double CalcNetProfit(double grossProfit, double operatingExpenses, double taxes, double interest)
        {
            return grossProfit - operatingExpenses - taxes - interest;
        }

        public double CalcOperatingProfit(double grossProfit, double operatingExpenses)
        {
            return grossProfit - operatingExpenses;
        }

        public double CalcSalesRevenue(double grossSales, double salesOfReturnsAndAllowances)
        {
            return grossSales - salesOfReturnsAndAllowances;
        }

        // Debt
        public double CalcDebtEquityRatio(double totalLiabilities, double shareholderEquity)
        {
            return totalLiabilities / shareholderEquity;
        }

        public double CalcDebtRatio(double totalLiabilities, double totalAssets)
        {
            return totalLiabilities / totalAssets;
        }

        public double CalcDebtServiceCoverageRatio(double netOperatingIncome, double totalDebtService)
        {
            return netOperatingIncome / totalDebtService;
        }

        public double CalcLongTermDebtEquityRatio(double longTermLiabilities, double equity)
        {
            return longTermLiabilities / equity;
        }

        // Depreciation
        public double CalcBookValue(double acquisitionCost, double depreciation)
        {
            return acquisitionCost - depreciation;
        }

        public double CalcDecliningBalance(double depreciationRate, double bookValueAtBeginningOfYear)
        {
            return depreciationRate * bookValueAtBeginningOfYear;
        }

        public double CalcUnitsOfProduction(double costOfAsset, double residualValue, double estimatedTotalProduction, double actualProduction)
        {
            return ((costOfAsset - residualValue) / estimatedTotalProduction) * actualProduction;
        }

        public double CalcStraightLineMethod(double costOfFixedAsset, double residualValue, double usefulLifeOfAsset)
        {
            return (costOfFixedAsset - residualValue) / usefulLifeOfAsset;
        }

        // Liquidity
        public double CalcCashRatio(double cash, double marketableSecurities, double currentLiabilities)
        {
            return (cash + marketableSecurities) / currentLiabilities;
        }

        public double CalcCurrentRatio(double currentAssets, double currentLiabilities)
        {
            return currentAssets / currentLiabilities;
        }

        public double CalcOperatingCashFlowRatio(double operatingCashFlow, double totalDebts)
        {
            return operatingCashFlow / totalDebts;
        }

        public double CalcQuickRatio(double currentAssets, double inventories, double currentLiabilities)
        {
            return (currentAssets - inventories) / currentLiabilities;
        }

        // Market
        public double CalcDividendCover(double earningsPerShare, double dividendsPerShare)
        {
            return earningsPerShare / dividendsPerShare;
        }

        public double CalcDividendsPerShare(double dividendsPaid, double numberOfShares)
        {
            return dividendsPaid / numberOfShares;
        }

        public double CalcDividendYield(double annualDividendPerShare, double pricePerShare)
        {
            return annualDividendPerShare / pricePerShare;
        }

        public double CalcEarningsPerShare(double netEarnings, double numberOfShares)
        {
            return netEarnings / numberOfShares;
        }

        public double CalcPayoutRatio(double dividends, double earnings)
        {
            return dividends / earnings;
        }

        public double CalcPegRatio(double pricePerEarnings, double annualEpsGrowth)
        {
            return pricePerEarnings / annualEpsGrowth;
        }

        public double CalcPriceSalesRatio(double pricePerShare, double revenuePerShare)
        {
            return pricePerShare / revenuePerShare;
        }

        // Profitability
        public double CalcEfficiencyRatio(double nonInterestExpense, double revenue)
        {
            return nonInterestExpense / revenue;
        }

        public double CalcGrossProfitMargin(double grossProfit, double revenue)
        {
            return grossProfit / revenue;
        }

        public double CalcOperatingMargin(double operatingIncome, double revenue)
        {
            return operatingIncome / revenue;
        }

        public double CalcProfitMargin(double netProfit, double revenue)
        {
            return netProfit / revenue;
        }

        public double CalcReturnOnAssets(double netIncome, double totalAssets)
        {
            return netIncome / totalAssets;
        }

        public double CalcReturnOnCapital(double ebit, double taxRate, double investedCapital)
        {
            return ebit * (1 - taxRate) / investedCapital;
        }

        public double CalcReturnOnEquity(double netIncome, double averageShareholderEquity)
        {
            return netIncome / averageShareholderEquity;
        }

        public double CalcReturnOnNetAssets(double netIncome, double fixedAssets, double workingCapital)
        {
            return netIncome / (fixedAssets + workingCapital);
        }

        public double CalcRiskAdjustedReturnOnCapital(double expectedReturn, double economicCapital)
        {
            return expectedReturn / economicCapital;
        }

        public double CalcReturnOnInvestment(double gain, double cost)
        {
            return (gain - cost) / cost;
        }

        public double CalcEbitda(double ebit, double depreciation, double amortization)
        {
            return ebit + depreciation + amortization;
        }
    }
}
