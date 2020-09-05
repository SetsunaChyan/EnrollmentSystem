module.exports = {
    runtimeCompiler: true,
    publicPath: '/',
    devServer: {
        proxy: {
            '/api/': {
                target: 'http://localhost:8080/',
                changeOrigin: true,
                ws: true,
                pathRewrite: {
                    '^/api': ''
                }
            }
        }
    }
}