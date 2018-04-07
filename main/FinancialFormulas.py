""" activity """


def calc_asset_turnover(net_sales, total_assets):
    return net_sales / total_assets


def calc_average_collection_period(accounts_receivable, annual_credit_sales):
    return accounts_receivable / (annual_credit_sales / 365)


def calc_cash_conversion_cycle(        
        inventory_conversion_period,
        receivables_conversion_period,
        payables_conversion_period):
    return (inventory_conversion_period
            + receivables_conversion_period - payables_conversion_period)


def calc_inventory_conversion_period(inventory_turnover_ratio):
    return 365 / inventory_turnover_ratio


def calc_inventory_conversion_ratio(sales, cost_of_goods_sold):
    return (sales * 0.5) / cost_of_goods_sold


def calc_inventory_turnover(sales, average_inventory):
    return sales / average_inventory


def calc_payables_conversion_period(accounts_payable, purchases):
    return (accounts_payable / purchases) * 365


def calc_receivables_conversion_period(receivables, net_sales):
    return (receivables / net_sales) * 365


def calc_receivables_turnover_ratio(net_credit_sales, average_net_receivables):
    return net_credit_sales / average_net_receivables


""" basic """


def calc_assets(liabilities, equity):
    return liabilities + equity


def calc_ebit(revenue, operating_expenses):
    return revenue - operating_expenses


def calc_equity(assets, liabilities):
    return assets - liabilities


def calc_gross_profit(revenue, cost_of_goods_sold):
    return revenue - cost_of_goods_sold


def calc_liabilities(assets, equity):
    return assets - equity


def calc_net_profit(gross_profit, operating_expenses, taxes, interest):
    return gross_profit - operating_expenses - taxes - interest


def calc_operating_profit(gross_profit, operating_expenses):
    return gross_profit - operating_expenses


def calc_sales_revenue(gross_sales, sales_of_returns_and_allowances):
    return gross_sales - sales_of_returns_and_allowances


""" debt """


def calc_debt_equity_ratio(total_liabilities, shareholder_equity):
    return total_liabilities / shareholder_equity


def calc_debt_ratio(total_liabilities, total_assets):
    return total_liabilities / total_assets


def calc_debt_service_coverage_ratio(net_operating_income, total_debt_service):
    return net_operating_income / total_debt_service


def calc_long_term_debt_equity_ratio(long_term_liabilities, equity):
    return long_term_liabilities / equity


""" depreciation """


def calc_book_value(acquisition_cost, depreciation):
    return acquisition_cost - depreciation


def calc_declining_balance(depreciation_rate, book_value_at_beginning_of_year):
    return depreciation_rate * book_value_at_beginning_of_year


def calc_units_of_production(        
        cost_of_asset,
        residual_value,
        estimated_total_production,
        actual_production):
    return ((cost_of_asset - residual_value) /
            estimated_total_production) * actual_production


def calc_straight_line_method(        
        cost_of_fixed_asset,
        residual_value,
        useful_life_of_asset):
    return (cost_of_fixed_asset - residual_value) / useful_life_of_asset


""" liquidity """


def calc_cash_ratio(cash, marketable_securities, current_liabilities):
    return (cash + marketable_securities) / current_liabilities


def calc_current_ratio(current_assets, current_liabilities):
    return current_assets / current_liabilities


def calc_operating_cash_flow_ratio(operating_cash_flow, total_debts):
    return operating_cash_flow / total_debts


def calc_quick_ratio(current_assets, inventories, current_liabilities):
    return (current_assets - inventories) / current_liabilities


""" market """


def calc_dividend_cover(earnings_per_share, dividends_per_share):
    return earnings_per_share / dividends_per_share


def calc_dividends_per_share(dividends_paid, number_of_shares):
    return dividends_paid / number_of_shares


def calc_dividend_yield(annual_dividend_per_share, price_per_share):
    return annual_dividend_per_share / price_per_share


def calc_earnings_per_share(net_earnings, number_of_shares):
    return net_earnings / number_of_shares


def calc_payout_ratio(dividends, earnings):
    return dividends / earnings


def calc_peg_ratio(price_per_earnings, annual_eps_growth):
    return price_per_earnings / annual_eps_growth


def calc_price_sales_ratio(price_per_share, revenue_per_share):
    return price_per_share / revenue_per_share


""" profitability """


def calc_efficiency_ratio(non_interest_expense, revenue):
    return non_interest_expense / revenue


def calc_gross_profit_margin(gross_profit, revenue):
    return gross_profit / revenue


def calc_operating_margin(operating_income, revenue):
    return operating_income / revenue


def calc_profit_margin(net_profit, revenue):
    return net_profit / revenue


def calc_return_on_assets(net_income, total_assets):
    return net_income / total_assets


def calc_return_on_capital(ebit, tax_rate, invested_capital):
    return ebit * (1 - tax_rate) / invested_capital


def calc_return_on_equity(net_income, average_shareholder_equity):
    return net_income / average_shareholder_equity


def calc_return_on_net_assets(net_income, fixed_assets, working_capital):
    return net_income / (fixed_assets + working_capital)


def calc_risk_adjusted_return_on_capital(expected_return, economic_capital):
    return expected_return / economic_capital


def calc_return_on_investment(gain, cost):
    return (gain - cost) / cost


def calc_ebitda(ebit, depreciation, amortization):
    return ebit + depreciation + amortization
