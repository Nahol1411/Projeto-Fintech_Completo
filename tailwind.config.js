/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    "./src/main/resources/templates/**/*.html",
    "./src/main/resources/static/**/*.js",
  ],
  theme: {
    extend: {
      colors: {
        'preto': 'var(--preto)',
        'branco': 'var(--branco)',
        'ciano': 'var(--ciano)',
        'cinza_principal': 'var(--cinza_principal)',
      },
      backgroundImage: {
        'login-container': "linear-gradient(90deg, rgba(17, 17, 18, 1) 20%, rgba(17, 17, 18, 1) 50%, rgba(0, 0, 0, 0) 100%), url('/images/bg-login.png')",
      }
    },
  },
  plugins: [],
}